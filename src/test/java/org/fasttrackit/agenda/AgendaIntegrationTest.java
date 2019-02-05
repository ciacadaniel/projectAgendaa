package org.fasttrackit.agenda;

import org.fasttrackit.agenda.domain.Agenda;
import org.fasttrackit.agenda.domain.Contact;
import org.fasttrackit.agenda.repo.AgendaRepository;
import org.fasttrackit.agenda.service.AgendaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PhoneAgenda.class, loader = SpringApplicationContextLoader.class, initializers = ConfigFileApplicationContextInitializer.class)

public class AgendaIntegrationTest {

    @Autowired
    private AgendaRepository repository;

    @Autowired
    private AgendaService agendaService;

 @Test

public void testSave(){


    Agenda agenda=new Agenda();
    agenda.setName("agendamea");
    agendaService.saveAgenda(agenda);
    Agenda agenda2=new Agenda();
    agenda2.setName("agendavoastra");
    agendaService.saveAgenda(agenda2);
 }


    @Test
    public void testGetAll() {

        System.out.println(agendaService.getAllAgendas());
        }



    }

