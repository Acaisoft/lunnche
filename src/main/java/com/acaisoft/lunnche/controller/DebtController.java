package com.acaisoft.lunnche.controller;

import com.acaisoft.lunnche.model.Debt;
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

    @RequestMapping(value = "/personaldebts", method = RequestMethod.GET)
    @ResponseBody
    public void getDebts(){
        List<Debt> debts = debtRepository.findAll();
    }
}
