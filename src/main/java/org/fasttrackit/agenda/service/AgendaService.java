package org.fasttrackit.agenda.service;

import org.fasttrackit.agenda.domain.Agenda;
import org.fasttrackit.agenda.dto.AgendaDTO;
import org.fasttrackit.agenda.repo.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class AgendaService {
    @Autowired
    private AgendaRepository agendaRepository;

    @Transactional
    public  void saveAgenda(Agenda agenda) {
        if (agenda.getName() == null) {
            throw new IllegalArgumentException("Can;t  be null");
        }
        try {
            agendaRepository.save(agenda);
        } catch (Exception e) {
            System.out.println("Error when saving agenda" + e);
        }

    }
    @Transactional
    public List<AgendaDTO> getAllAgendas() {
        List<AgendaDTO> result = new ArrayList<>();
        Iterator<Agenda> iterator = agendaRepository.findAll().iterator();
        while (iterator.hasNext()) {
            Agenda next = iterator.next();
            result.add(ConvertorUtils.convertToDto(next));
        }
        return result;
    }

    @Transactional
    public AgendaDTO getAgenda(long id) {
        Agenda one = agendaRepository.findOne(id);
        if (one == null) {
            throw new IllegalArgumentException("Invalid id");
        }
        AgendaDTO dto = ConvertorUtils.convertToDto(one);
        return dto;
    }


}
