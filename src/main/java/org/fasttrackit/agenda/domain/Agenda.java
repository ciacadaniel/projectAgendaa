package org.fasttrackit.agenda.domain;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private String name;
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
}
