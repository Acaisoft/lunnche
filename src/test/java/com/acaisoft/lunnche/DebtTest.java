package com.acaisoft.lunnche;

import com.acaisoft.lunnche.model.Debt;
import com.acaisoft.lunnche.model.User;
import com.acaisoft.lunnche.repository.DebtRepository;
import com.acaisoft.lunnche.repository.UserRepository;
import com.github.springtestdbunit.annotation.DatabaseSetup;
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
@DatabaseSetup("/test-debt-entries.xml")
public class DebtTest {
    @Autowired
    DebtRepository debtRepository;

    @Autowired
    UserRepository userRepository;

    @Test
    public void createNewUsersAndTheirDebts(){
        List<Debt> debts =debtRepository.findAll();
        List<User> users = userRepository.findAll();
        debts.stream().forEach(System.out::println);
        Assert.assertEquals("Two users", 2, users.size());
        Assert.assertEquals("One debt", 1, debts.size());

    }
}
