package org.fasttrackit.agenda;

import org.fasttrackit.agenda.domain.User;
import org.fasttrackit.agenda.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PhoneAgenda.class, loader = SpringApplicationContextLoader.class, initializers = ConfigFileApplicationContextInitializer.class)
public class UserIntegrationTest {


    @Autowired
    private UserService userService;

    @Test
    public void testSave() {
        User user=new User();
        user.setFirstname("Ciaca");
        user.setLastname("Daniel");
        userService.saveUser(user);
    }

}
