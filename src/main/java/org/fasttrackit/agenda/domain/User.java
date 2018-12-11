package org.fasttrackit.agenda.domain;

import javax.persistence.*;

@Entity
@Table(name="usersAgenda")
public class User {

    @Id
    @GeneratedValue
    private long id;

    @OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
    @JoinColumn(name="usersAgenda_id")
    private String firstname;

    private String lastname;


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}
