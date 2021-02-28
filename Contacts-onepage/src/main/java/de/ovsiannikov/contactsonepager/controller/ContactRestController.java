package de.ovsiannikov.contactsonepager.controller;

import de.ovsiannikov.contactsonepager.dto.ContactDto;
import de.ovsiannikov.contactsonepager.entity.Contact;
import de.ovsiannikov.contactsonepager.service.ContactService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/contacts")
public class ContactRestController {

    final ContactService contactService;

    public ContactRestController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping
    public ContactDto create(@RequestBody ContactDto contactDto) {
        Contact contact = contactService.create(
                contactDto.firstName,
                contactDto.lastName,
                contactDto.age);

        contactDto.id = contact.getId();
        return contactDto;
    }

    @GetMapping("{id}")
    public ContactDto get(@PathVariable int id) {
        Contact contact = contactService.get(id);

        return new ContactDto(
                contact.getId(),
                contact.getFirstName(),
                contact.getLastName(),
                contact.getAge()
        );
    }

    @GetMapping
    public List<ContactDto> getAll(@RequestParam(required = false) String firstName, String lastName) {
        List<Contact> contacts;
        if (firstName != null && lastName == null) {
            contacts = contactService.getAllByFirstName(firstName);
        } else if (firstName == null && lastName != null) {
            contacts = contactService.getAllByLastName(lastName);
        } else if (firstName != null) {
            contacts = contactService.getAllByLastNameAndFirstName(firstName, lastName);
        } else
            contacts = contactService.getAll();


        return contacts.stream()
                .map(contact -> new ContactDto(contact.getId(),
                        contact.getFirstName(),
                        contact.getLastName(),
                        contact.getAge()))
                .collect(Collectors.toList());
    }

    @PutMapping
    // not necessary
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void edit(@RequestBody ContactDto contactDto) {
        contactService.edit(
                contactDto.id,
                contactDto.firstName,
                contactDto.lastName,
                contactDto.age);
    }

    @DeleteMapping("{id}")
    public ContactDto remove(@PathVariable int id) {
        Contact contact = contactService.remove(id);

        return new ContactDto(
                contact.getId(),
                contact.getFirstName(),
                contact.getLastName(),
                contact.getAge()
        );
    }
}
