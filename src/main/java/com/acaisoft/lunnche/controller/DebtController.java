package com.acaisoft.lunnche.controller;

import com.acaisoft.lunnche.model.Debt;
import com.acaisoft.lunnche.model.DebtHistory;
import com.acaisoft.lunnche.repository.DebtRepository;
import com.acaisoft.lunnche.repository.DebtHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DebtController {
    @Autowired
    DebtHistoryRepository debtHistoryRepository;

    @Autowired
    DebtRepository debtRepository;



  /*  @RequestMapping(value = "/createdebts")
    @ResponseBody
    private void createDebts(){
      List<DebtHistory> debtsHistory = debtHistoryRepository.findAll();
      List<Debt> debts = new ArrayList<Debt>();
      int a =0;
      for(int x =0; x< debtsHistory.size(); x++){
          if(debts.get(a).getCreditor().equals(debtsHistory.get(x).getCreditor())) {
              if (debts.get(a).getDebtor().equals(debtsHistory.get(x).getDebtor())) {
                  double sum = debts.get(a).getDebt() + debtsHistory.get(x).getDebt();
                  debts.get(a).setDebt(sum);
              }
              else{
                for(int b = 0; b<debtsHistory.size();b++){
                    //check if debts.get(a).getDebtor().equals(debtsHistory.get(b).getDebtor());
                }
              }
          }
          else if(debts.get(a) == null){
              debts.get(a).setCreditor(debtsHistory.get(x).getCreditor());
              debts.get(a).setDebtor(debtsHistory.get(x).getDebtor());
              debts.get(a).setDebt(debtsHistory.get(x).getDebt());
          }
          else{
              //if creditor is not equal, check whole list again
              //if found, check its debtor
              //if that element doesn't contain its debtor, check debtors
              //if no elemt found, add it to the list
          }
      }
    } */
}