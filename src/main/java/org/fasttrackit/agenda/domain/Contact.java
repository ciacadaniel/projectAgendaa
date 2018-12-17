package org.fasttrackit.agenda.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Contact {
    @Id
    @GeneratedValue(generator = "contact_generator")
    @SequenceGenerator(name = "contact_generator", sequenceName = "contact_sequence", initialValue = 1)
    private long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private ContactCategory category;


   // @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
   // @JoinColumn(name = "contact_id")
    private List<ContactCategory> contactcategories = new ArrayList<ContactCategory>();


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public List<ContactCategory> getContactcategories() {
        return contactcategories;
    }

    public void setContactcategories(List<ContactCategory> contactcategories) {
        this.contactcategories = contactcategories;
    }
}
