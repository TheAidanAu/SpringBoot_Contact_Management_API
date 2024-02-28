package com.decadev.services;

import com.decadev.entities.Contact;
import com.decadev.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    @Autowired
    ContactRepository contactRepository;

    public List<Contact> findAll() {
        return this.contactRepository.findAll();
    }

    public Optional<Contact> findById(Long id) {
        return this.contactRepository.findById(id);
    }


    public Contact save(Contact contact) {
        return this.contactRepository.save(contact);
    }


    public String delete(Long id) {
        Optional<Contact> contactToDelete = contactRepository.findById(id);

        if (contactToDelete.isPresent()) {
            this.contactRepository.delete(contactToDelete.get());
            return "Contact successful deleted" + id;
        } else {
            return "Contact NOT successful deleted" + id;
        }
    }

    public Contact update(Long id, Contact updatedContact) {
        Contact contactToUpdate = this.findById(id).get();
        contactToUpdate.setEmail(updatedContact.getEmail());
        contactToUpdate.setFirstName(updatedContact.getFirstName());
        contactToUpdate.setLastName(updatedContact.getLastName());
        return this.contactRepository.save(contactToUpdate);
    }

}
