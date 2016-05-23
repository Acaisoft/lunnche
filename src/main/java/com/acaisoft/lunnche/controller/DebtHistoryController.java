package com.acaisoft.lunnche.controller;

import com.acaisoft.lunnche.model.DebtHistory;
import com.acaisoft.lunnche.model.User;
import com.acaisoft.lunnche.repository.UserRepository;
import com.acaisoft.lunnche.repository.DebtHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DebtHistoryController {

    @Autowired
    private DebtHistoryRepository debtHistoryRepository;

    @Autowired
    private UserRepository userRepository;

    private Integer i = 0;

    @RequestMapping(value = "/personalcredits", method = RequestMethod.GET)
    @ResponseBody
    public List getCredits(){
        List<User> users = userRepository.findAll();
        User foundUser =  users.get(i);
        List<DebtHistory> userCredits = debtHistoryRepository.findByCreditor(foundUser);
        return userCredits; //returns ALL of user debts
    }

    @RequestMapping(value = "/personaldebts", method = RequestMethod.GET)
    @ResponseBody
    public List getDebts(){
        List<User> users = userRepository.findAll();
        User foundUser =  users.get(i);
        List<DebtHistory> userDebts = debtHistoryRepository.findByDebtor(foundUser);
        return userDebts; //returns ALL of user debts
    }

    @RequestMapping(value = "/highestcredit")
    @ResponseBody
    public DebtHistory highestCredit(){
        List<User> usersList = userRepository.findAll();
        User foundUser =  usersList.get(i);
        List<DebtHistory> userCredits = debtHistoryRepository.findByCreditorOrderByDebtDesc(foundUser);
        DebtHistory highestCredit = userCredits.get(0);
        return highestCredit; //returns only the highest debt, with you as creditor
    }

    @RequestMapping(value = "/highestdebt")
    @ResponseBody
    public DebtHistory highestDebt(){
        List<User> usersLists = userRepository.findAll();
        User foundUser =  usersLists.get(i);
        List<DebtHistory> userDebt = debtHistoryRepository.findByDebtorOrderByDebtDesc(foundUser);
        DebtHistory highestDebt = userDebt.get(0);
        return highestDebt; //returns only the highest debt, with you as a debtor
    }

    @RequestMapping(value ="/alldebt")
    @ResponseBody
    public double allDebtsSumed(){
        double sum = 0;
        List<User> users = userRepository.findAll();
        User foundUser =  users.get(i);
        List<DebtHistory> userDebts = debtHistoryRepository.findByDebtor(foundUser);
        for(int x =0; x<userDebts.size();x++){
            double debt = userDebts.get(x).getDebt();
            sum = sum + debt;
        }
        return sum;
    }

    @RequestMapping(value ="/allcredit")
    @ResponseBody
    public double allCreditssSumed(){
        double sum = 0;
        List<User> users = userRepository.findAll();
        User foundUser =  users.get(i);
        List<DebtHistory> userCredits = debtHistoryRepository.findByCreditor(foundUser);
        for(int x =0; x<userCredits.size();x++){
            double debt = userCredits.get(x).getDebt();
            sum = sum + debt;
        }
        return sum;
    }
}

