package org.fasttrackit.agenda.repo;

import org.fasttrackit.agenda.domain.Contact;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ContactRepository  extends PagingAndSortingRepository<Contact,Long> {
}
