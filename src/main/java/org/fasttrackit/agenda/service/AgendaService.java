package org.fasttrackit.agenda.service;

import org.fasttrackit.agenda.domain.Agenda;
import org.fasttrackit.agenda.persistence.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgendaService {
    @Autowired
    private AgendaRepository agendaRepository;

    public void saveAgenda(Agenda agenda) {
        if (agenda.getName() == null) {
            throw new IllegalArgumentException("Can;t  be null");
        }
        try {
            agendaRepository.save(agenda);
        } catch (Exception e) {
            System.out.println("Error when saving agenda" + e);
        }

    }

    public Iterable<Agenda> getShops() {
      return  agendaRepository.findAll();
    }
}
