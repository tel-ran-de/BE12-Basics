package de.ovsiannikov.contactsonepager.service;

import de.ovsiannikov.contactsonepager.entity.Contact;
import de.ovsiannikov.contactsonepager.repository.ContactRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public Contact create(String firstName, String lastName, Integer age) {
        Contact contact = new Contact(firstName, lastName, age);
        contactRepository.save(contact);
        return contact;
    }

    public List<Contact> getAll() {
        List<Contact> res = new ArrayList<>();
        contactRepository.findAll().forEach(res::add);
        return res;
    }

    public Contact get(int id) {
        Optional<Contact> optionalContact = contactRepository.findById(id);
        return optionalContact.orElseThrow(EntityNotFoundException::new);
    }

    public void edit(int id, String firstName, String lastName, Integer age) {
        Contact contact = get(id);
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setAge(age);
        contactRepository.save(contact);
    }

    public Contact remove(int id) {
        Contact contactForDelete = get(id);
        contactRepository.delete(contactForDelete);

        return contactForDelete;
    }
}
