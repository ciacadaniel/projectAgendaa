package org.fasttrackit.agenda.web;

import org.fasttrackit.agenda.domain.Agenda;
import org.fasttrackit.agenda.dto.AgendaDTO;
import org.fasttrackit.agenda.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AgendaController {

    @Autowired
    private AgendaService service;

    @RequestMapping(path = "/agenda/{id}", method = RequestMethod.GET)
    @ResponseBody
    public AgendaDTO getAgendaById(@PathVariable long id) {
        return service.getAgenda(id);
    }

    @RequestMapping(path = "/agenda", method = RequestMethod.GET)
    @ResponseBody
    public List<AgendaDTO> getAgendas() {
        return service.getAllAgendas();
    }
}
