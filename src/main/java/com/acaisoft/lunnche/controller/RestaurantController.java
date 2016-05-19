package com.acaisoft.lunnche.controller;

import com.acaisoft.lunnche.model.Restaurant;
import com.acaisoft.lunnche.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RestaurantController {
    @Autowired
    RestaurantRepository restaurantRepository;

    @RequestMapping(value = "/listofrestaurants", method = RequestMethod.GET)
    @ResponseBody
    public List<Restaurant> getRestaurants() {
        return restaurantRepository.findAll();
    }

}
