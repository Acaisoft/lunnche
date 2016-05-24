package com.acaisoft.lunnche.controller;

import com.acaisoft.lunnche.model.User;
import com.acaisoft.lunnche.model.Debt;
import com.acaisoft.lunnche.model.DebtHistory;
import com.acaisoft.lunnche.repository.DebtRepository;
import com.acaisoft.lunnche.repository.DebtHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

@Controller
public class DebtController {
    @Autowired
    DebtHistoryRepository debtHistoryRepository;

    @Autowired
    DebtRepository debtRepository;



    @RequestMapping(value = "/createdebts")
    @ResponseBody
    private List<Debt> createDebts() {
        List<DebtHistory> debtsHistory = debtHistoryRepository.findAll(); //import repo, to use its contents
        int i = 0;
        List<DebtHistory> debts = new ArrayList<DebtHistory>();
        List<DebtHistory> orderedDebts = new ArrayList<DebtHistory>();
        List<Debt> finalDebts = new ArrayList<Debt>();
        Debt debt = new Debt();
        int a = 0,b =0;
        int x =0;
        int n = x+1;
        double sum = 0;
        try {
            while (!debtsHistory.get(i).equals(null)) {
                User user = debtsHistory.get(i).getCreditor();
                debtsHistory.stream()
                        .sequential()
                        .filter(s -> s.getCreditor().equals(user))
                        .forEachOrdered(debts::add); //stream, which puts all debts in order by users
                i++;
            }
        }catch (IndexOutOfBoundsException index) {
            }

        //now let's arrange them in correct order (by both creditor and debtor), without repeats!
        try{
            while(a<debts.size()){
                User creditor = debts.get(a).getCreditor();
                User debtor = debts.get(b).getDebtor();
                debts.stream()
                        .sequential()
                        .filter(f -> f.getCreditor().equals(creditor))
                        .filter(g -> g.getDebtor().equals(debtor))
                        .filter(h -> !orderedDebts.contains(h))
                        .forEachOrdered(orderedDebts::add);
                a++;
                b++;
            }
        }catch(IndexOutOfBoundsException indextwo){
        }


        //and now: calculations :x
        //REQUIRES FIXING!
        try{
            while(x<orderedDebts.size()){
                User finalCreditor = orderedDebts.get(x).getCreditor();
                User finalDebtor = orderedDebts.get(x).getDebtor();
                sum = sum +orderedDebts.get(x).getDebt();
                debt.setCreditor(finalCreditor);
                debt.setDebtor(finalDebtor);
                debt.setDebt(sum); //set sum of all debts of this creditor and debtor
                if(finalCreditor.equals(orderedDebts.get(n).getCreditor()) && finalDebtor.equals(orderedDebts.get(n).getDebtor())){
                     x++;
                }
                else{
                    finalDebts.add(debt); //add actual whole debt
                    sum=0;
                    debt.setDebt(sum);
                    x++;
                }
            }
        }catch(IndexOutOfBoundsException indexthree){

        }

        return finalDebts;
    }
}