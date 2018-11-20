package org.fasttrackit.agenda.service;

import org.fasttrackit.agenda.domain.User;
import org.fasttrackit.agenda.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user) throws IllegalArgumentException {
        if (user.getFirstname() == null) {
            throw new IllegalArgumentException("First name cannot be null");
        }

        if (user.getLastname() == null) {
            throw new IllegalArgumentException("First name cannot be null");

        }

        userRepository.save(user);

    }

}
