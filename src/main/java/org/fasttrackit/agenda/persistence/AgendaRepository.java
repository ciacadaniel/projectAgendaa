package org.fasttrackit.agenda.persistence;

import org.fasttrackit.agenda.domain.Agenda;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AgendaRepository extends PagingAndSortingRepository<Agenda,Long> {
}
