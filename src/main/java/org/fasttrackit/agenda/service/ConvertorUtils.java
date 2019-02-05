package org.fasttrackit.agenda.service;

import org.fasttrackit.agenda.domain.Agenda;
import org.fasttrackit.agenda.domain.Contact;
import org.fasttrackit.agenda.domain.User;
import org.fasttrackit.agenda.dto.AgendaDTO;
import org.fasttrackit.agenda.dto.ContactDTO;
import org.fasttrackit.agenda.dto.UserDTO;

import java.util.ArrayList;
import java.util.List;

public class ConvertorUtils {
    

        public static AgendaDTO convertToDto(Agenda one) {
            AgendaDTO dto = new AgendaDTO();
            dto.setId(one.getId());
            dto.setName(one.getName());
            List<ContactDTO> contacteDto = new ArrayList<>();
            for (Contact c : one.getContactList()) {
                ContactDTO cd = convertToDto(c);
                contacteDto.add(cd);
            }

            dto.setContacte(contacteDto);
            return dto;
        }

        public static ContactDTO convertToDto(Contact c) {
            ContactDTO cd = new ContactDTO();
            cd.setFirstName(c.getFirstName());
            cd.setLastName(c.getLastName());
            cd.setPhoneNumber(c.getPhoneNumber());
            cd.setId(c.getId());
            return cd;
        }

        public static UserDTO convertToDto (User u) {
          UserDTO ud=new UserDTO();
          ud.setFirstName(u.getFirstName());
          ud.setLastName(u.getLastName());
          ud.setId(ud.getId());
          return ud;
          }
    }

