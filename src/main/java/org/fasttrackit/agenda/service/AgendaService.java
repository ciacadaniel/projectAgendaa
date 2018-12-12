package org.fasttrackit.agenda.service;

import org.fasttrackit.agenda.domain.Agenda;
import org.fasttrackit.agenda.dto.AgendaDTO;
import org.fasttrackit.agenda.persistence.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.io.Serializable;

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

    public AgendaDTO getAgendaById(long id) {
       Agenda agenda= (Agenda) agendaRepository.findOne(id);
       if(agenda==null ) {
           throw new IllegalArgumentException("The id is not valid");
       }
       return convertToDto(agenda);

    }

    private AgendaDTO convertToDto(Agenda agenda) {
        AgendaDTO agendaDTO = new AgendaDTO();
        agendaDTO.setName(agenda.getName());
        agendaDTO.setId(agenda.getId()); //aici trebe sa fac setid si alea
        return agendaDTO;
        }

    private Agenda convert(AgendaDTO agendaDTO) {
        Agenda agenda = new Agenda();
        agendaDTO.setName(agendaDTO.getName());
        agendaDTO.setId(agendaDTO.getId()); //aici trebe sa fac setid si alea
        return agenda;
    }

    public AgendaDTO updateAgenda(long id,AgendaDTO dto) {

      Agenda agenda= (Agenda) agendaRepository.findOne(id);
      agenda.setName(dto.getName());
      Agenda savedAgenda = (Agenda) agendaRepository.save(agenda);
      return convertToDto(savedAgenda);
    }
}
