package com.decadev.repositories;

import com.decadev.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    // JpaRepository has most comment CRUD operations

    Optional<Contact> findByFirstName(String firstName);

    Optional<Contact> findByLastName(String lastName);

    Optional<Contact> findByEmail(String email);

}
