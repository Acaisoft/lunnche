package com.acaisoft.lunnche;

import com.acaisoft.lunnche.model.Debt;
import com.acaisoft.lunnche.model.User;
import com.acaisoft.lunnche.repository.DebtRepository;
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
public class DebtTest {
    @Autowired
    DebtRepository debtRepository;

    @Autowired
    UserRepository userRepository;

    @Test
    public void createNewUsersAndTheirDebts(){
        User user1 = new User();
        user1.setFirstName("Maciej");
        user1.setLastName("Sawicki");
        user1.setBalance(20.0);
        user1.setUsername("maciej");
        user1.setPassword("123");
        userRepository.save(user1);

        User user2 = new User();
        user2.setFirstName("Adrian");
        user2.setLastName("Castillo");
        user2.setBalance(0);
        user2.setUsername("adrian");
        user2.setPassword("321");
        userRepository.save(user2);

        Debt debt = new Debt();
        debt.setCreditor(user1);
        debt.setDebtor(user2);
        debt.setDebt(10.0);
        debtRepository.save(debt);

        Debt debt2 = new Debt();
        debt2.setCreditor(user2);
        debt2.setDebtor(user1);
        debt2.setDebt(20.4);
        debtRepository.save(debt2);

        List<Debt> debts = debtRepository.findAll();
        debts.stream().forEach(System.out::println);

        Assert.assertEquals("There should be two debts", 2, debts.size());
    }
}
