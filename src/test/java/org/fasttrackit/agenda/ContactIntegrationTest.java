package org.fasttrackit.agenda;


import org.fasttrackit.agenda.domain.Contact;
//import org.fasttrackit.agenda.domain.ContactCategory;
import org.fasttrackit.agenda.service.ContactService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PhoneAgenda.class, loader = SpringApplicationContextLoader.class, initializers = ConfigFileApplicationContextInitializer.class)
public class ContactIntegrationTest {

    @Autowired
    private ContactService contactService;


    @Test
    public void testSave() {
        Contact contact = new Contact();
        contact.setFirstName("salve");
        contact.setLastName("malve");
        contact.setPhoneNumber("0727701231");
        contactService.saveContact(contact);
    Contact contact2=new Contact();
    contact2.setFirstName("Dana");
    contact2.setLastName("Bala");
    contact2.setPhoneNumber("12312312");
    contactService.saveContact(contact2);

    }




}
