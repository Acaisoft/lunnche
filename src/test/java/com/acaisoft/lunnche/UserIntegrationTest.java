package com.acaisoft.lunnche;

import com.acaisoft.lunnche.model.User;
import com.acaisoft.lunnche.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@Transactional

public class UserIntegrationTest {
    @Autowired
    UserRepository userRepository;

    @Test
    public void shouldCreateUsers(){
        User user1 = new User();
        user1.setFirstName("F");
        user1.setLastName("L");
        user1.setBalance(50);
        user1.setUsername("user");
        user1.setPassword("pass");
        userRepository.save(user1);

        User user2 = new User();
        user2.setFirstName("A");
        user2.setLastName("B");
        user2.setBalance(70);
        user2.setUsername("username");
        user2.setPassword("pass1");
        userRepository.save(user2);

        List<User> users = userRepository.findAll();
        users.stream().forEach(System.out::println);

        Assert.assertEquals("Users", 2, users.size());
    }
}
