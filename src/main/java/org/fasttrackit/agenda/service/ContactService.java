package org.fasttrackit.agenda.service;


import org.fasttrackit.agenda.domain.Contact;
import org.fasttrackit.agenda.dto.ContactDTO;
import org.fasttrackit.agenda.repo.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ContactService {
    @Autowired
    private ContactRepository contactRepository;

    public void saveContact (Contact contact){

        if (contact.getFirstName() == null) {
            throw new IllegalArgumentException("Can;t  be null");
        }


        if (contact.getLastName() == null) {
            throw new IllegalArgumentException("Can;t  be null");
        }


        if (contact.getPhoneNumber() == null) {
            throw new IllegalArgumentException("Can;t  be null");
        }
        try {
            contactRepository.save(contact);
        } catch (Exception e) {
            System.out.println("Error when saving contact" + e);
        }

    }

    @Transactional
    public void update(ContactDTO contact) {
        Contact updated = contactRepository.findOne(contact.getId());
        if (updated == null) {
            throw new IllegalArgumentException("Invalid id");

        }
        updated.setPhoneNumber(contact.getPhoneNumber());
        updated.setLastName(contact.getLastName());
        updated.setFirstName(contact.getFirstName());
        contactRepository.save(updated);

    }


    }

