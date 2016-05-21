package com.acaisoft.lunnche.controller;

import com.acaisoft.lunnche.model.Debt;
import com.acaisoft.lunnche.model.User;
import com.acaisoft.lunnche.repository.UserRepository;
import com.acaisoft.lunnche.repository.DebtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DebtController {

    @Autowired
    private DebtRepository debtRepository;

    @Autowired
    private UserRepository userRepository;

    private Integer i = 0;

    @RequestMapping(value = "/personaldebts", method = RequestMethod.GET)
    @ResponseBody
    public List getDebts(){
        List<User> users = userRepository.findAll();
        User foundUser =  users.get(i);
        List<Debt> userDebts = debtRepository.findByCreditor(foundUser);
        return userDebts; //returns ALL of user debts
    }

    @RequestMapping(value = "/highestcredit")
    @ResponseBody
    public Debt highestCredit(){
        List<User> usersList = userRepository.findAll();
        User foundUser =  usersList.get(i);
        List<Debt> userCredits = debtRepository.findByCreditorOrderByDebtDesc(foundUser);
        Debt highestCredit = userCredits.get(0);
        return highestCredit; //returns only the highest debt, with you as creditor
    }

    @RequestMapping(value = "/highestdebt")
    @ResponseBody
    public Debt highestDebt(){
        List<User> usersLists = userRepository.findAll();
        User foundUser =  usersLists.get(i);
        List<Debt> userDebt = debtRepository.findByDebtorOrderByDebtDesc(foundUser);
        Debt highestDebt = userDebt.get(0);
        return highestDebt; //returns only the highest debt, with you as a debtor
    }
}
