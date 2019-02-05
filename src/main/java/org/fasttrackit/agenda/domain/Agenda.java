package org.fasttrackit.agenda.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="Agendas")
public class Agenda implements Serializable {
    @Id
    @Column(name="id")
    @GeneratedValue(generator="agenda_generator")
    @SequenceGenerator(
            name="agenda_generator",
            sequenceName="agenda_sequence",
                initialValue =1
    )
    private long id;
    private String name;

    public List<Contact> getContactList() {
        return contactList;
    }

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Agenda{");
        sb.append("name='").append(name).append('\'');
        sb.append(", contactList=").append(contactList);
        sb.append('}');
        return sb.toString();
    }


    }

