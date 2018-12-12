package org.fasttrackit.agenda.web;

import org.fasttrackit.agenda.domain.Agenda;
import org.fasttrackit.agenda.dto.AgendaDTO;
import org.fasttrackit.agenda.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AgendaController {

    @Autowired
    private AgendaService agendaService;



    @RequestMapping(path="/agenda/{id}",method=RequestMethod.GET)
    public AgendaDTO getAgenda(@PathVariable("id") long id) {
      return  agendaService.getAgendaById(id);
    }

    @RequestMapping(path="/agenda",method=RequestMethod.POST)
    public void saveAgenda(@RequestBody Agenda agenda) {
        agendaService.saveAgenda(agenda);
    }
    @RequestMapping(path="/agenda/{id}",method=RequestMethod.PUT)
    public AgendaDTO updateAgenda(@PathVariable long id,@RequestBody AgendaDTO dto){

       return agendaService.updateAgenda(id,dto);

    }

}
