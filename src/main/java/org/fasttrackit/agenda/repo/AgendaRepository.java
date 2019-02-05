package org.fasttrackit.agenda.repo;

import org.fasttrackit.agenda.domain.Agenda;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AgendaRepository extends PagingAndSortingRepository<Agenda,Long> {
}
