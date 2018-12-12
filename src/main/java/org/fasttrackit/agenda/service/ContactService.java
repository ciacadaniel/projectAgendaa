package org.fasttrackit.agenda.service;


import org.fasttrackit.agenda.domain.Contact;
import org.fasttrackit.agenda.persistence.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    @Autowired
    private ContactRepository contactRepository;

    public void saveContact (Contact contact){

        if (contact.getFirstName() == null) {
            throw new IllegalArgumentException("Can;t  be null");
        }
        try {
            contactRepository.save(contact);
        } catch (Exception e) {
            System.out.println("Error when saving contact" + e);
        }

        if (contact.getLastName() == null) {
            throw new IllegalArgumentException("Can;t  be null");
        }
        try {
            contactRepository.save(contact);
        } catch (Exception e) {
            System.out.println("Error when saving contact" + e);
        }

        if (contact.getPhoneNumber() == null) {
            throw new IllegalArgumentException("Can;t  be null");
        }
        try {
            contactRepository.save(contact);
        } catch (Exception e) {
            System.out.println("Error when saving contact" + e);
        }

        if (contact.getContactcategories() == null) {
            throw new IllegalArgumentException("Can;t  be null");
        }
        try {
            contactRepository.save(contact);
        } catch (Exception e) {
            System.out.println("Error when saving agenda" + e);
        }

    }

    }

