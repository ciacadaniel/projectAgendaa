package org.fasttrackit.agenda.repo;

import org.fasttrackit.agenda.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {
}
