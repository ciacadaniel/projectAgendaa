package org.fasttrackit.agenda.service;

import org.fasttrackit.agenda.domain.User;
import org.fasttrackit.agenda.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user)  {
        if (user.getFirstName() == null) {
            throw new IllegalArgumentException("First name cannot be null");
        }

        if (user.getLastName() == null) {
            throw new IllegalArgumentException("First name cannot be null");

        }

        try {
            userRepository.save(user);
        }catch(Exception e) {
            System.out.println("Error when saving user " + e);
        }

    }

}
