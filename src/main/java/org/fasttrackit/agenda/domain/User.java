package org.fasttrackit.agenda.domain;

import javax.persistence.*;

@Entity
@Table(name = "usersAgenda")
public class User {

    @Id
    @GeneratedValue

    private long id;
    @Column(unique=true)

  // @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    //@JoinColumn(name = "usersAgenda_id")
    private String firstName;


    private String lastName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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
}
