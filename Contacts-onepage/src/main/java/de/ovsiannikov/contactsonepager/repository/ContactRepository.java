package de.ovsiannikov.contactsonepager.repository;

import de.ovsiannikov.contactsonepager.entity.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Integer> {
}
