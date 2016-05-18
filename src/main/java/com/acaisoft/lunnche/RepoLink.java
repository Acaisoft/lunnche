package com.acaisoft.lunnche;


import com.acaisoft.lunnche.repository.MealRepository;
import com.acaisoft.lunnche.repository.RestaurantRepository;
import com.acaisoft.lunnche.model.Meal;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Data
@Component

public class RepoLink {
    @Autowired
    private MealRepository mealRepository;
    @Autowired
    private RestaurantRepository restaurantRepository;

    public void repoLink(){
        Iterable<Meal> meals = mealRepository.findAll();
    }

}
