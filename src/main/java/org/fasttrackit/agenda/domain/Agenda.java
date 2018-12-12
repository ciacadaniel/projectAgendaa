package org.fasttrackit.agenda.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="PhoneAgenda")
public class Agenda implements Serializable {
    @Id
    @GeneratedValue(generator="agenda_generator")
    @SequenceGenerator(
            name="agenda-generator",
            sequenceName="agenda_sequence",
                initialValue =1
    )
    private String name;
    @OneToMany(fetch=FetchType.LAZY ,cascade=CascadeType.ALL)
    @JoinColumn(name="agenda_id")
    private List<Contact> contactList=new ArrayList<>();




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setContactList(List<Contact> list) throws IllegalArgumentException {
        if(contactList==null){
            throw new IllegalArgumentException("you are not allowed");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Agenda{");
        sb.append("name='").append(name).append('\'');
        sb.append(", contactList=").append(contactList);
        sb.append('}');
        return sb.toString();
    }

    public long getId() {
        return getId();
    }
}
