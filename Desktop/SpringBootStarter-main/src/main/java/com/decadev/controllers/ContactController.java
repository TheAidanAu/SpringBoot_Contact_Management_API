package com.decadev.controllers;

import com.decadev.entities.Contact;
import com.decadev.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    ContactService contactService;

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(this.contactService.findAll());
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Contact contact) {
        return ResponseEntity.ok(this.contactService.save(contact));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        return ResponseEntity.ok(this.contactService.delete(id));
    }

    @PutMapping("{id}")
    public ResponseEntity<?> update(@PathVariable Long id,
                                    @RequestBody Contact updatedContact) {
        return ResponseEntity.ok(this.contactService.update(id, updatedContact));
    }

}
