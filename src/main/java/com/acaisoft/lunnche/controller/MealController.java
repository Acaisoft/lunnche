package com.acaisoft.lunnche.controller;

import com.acaisoft.lunnche.model.Meal;
import com.acaisoft.lunnche.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MealController {

    @Autowired
    private MealRepository mealRepository;

    @RequestMapping(value = "/sum", method = RequestMethod.GET)
    @ResponseBody
    public double getSumOfPrices() {
        List<Meal> meals = mealRepository.findAll();
        double sum = 0;

        for(int i =0; i<meals.size(); i++) {
            double price =  meals.get(i).getPrice();
            sum = sum +price;
        }
        return sum;
    }


    public List<Meal> getMeal() {
        return mealRepository.findAll();
    }

}
