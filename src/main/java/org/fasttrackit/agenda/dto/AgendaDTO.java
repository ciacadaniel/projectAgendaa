package org.fasttrackit.agenda.dto;

import java.util.ArrayList;
import java.util.List;

public class AgendaDTO {

    private long Id;
    private String name;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public List<ContactDTO> getContacte() {
        return contacte;
    }

    public void setContacte(List<ContactDTO> contacte) {
        this.contacte = contacte;
    }

    private List<ContactDTO> contacte = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AgendaDTO{");
        sb.append("Id=").append(Id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", contacte=").append(contacte);
        sb.append('}');
        return sb.toString();
    }
}

