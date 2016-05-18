/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.acaisoft.lunnche;

import com.acaisoft.lunnche.model.Meal;
import com.acaisoft.lunnche.model.Restaurant;
import com.acaisoft.lunnche.model.User;
import com.acaisoft.lunnche.repository.MealRepository;
import com.acaisoft.lunnche.repository.RestaurantRepository;
import com.acaisoft.lunnche.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class ApplicationIntegrationTests {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Autowired
    private MealRepository mealRepository;

    @Test
    public void shouldCreateRestaurantWithMeals() {
        Meal meal1 = new Meal();
        meal1.setName("Meal #1");
        meal1.setPrice(10);
        mealRepository.save(meal1);

        Meal meal2 = new Meal();
        meal2.setName("Meal #2");
        meal2.setPrice(20);
        mealRepository.save(meal2);

        Restaurant restaurant = new Restaurant();
        restaurant.setName("Restaurant #1");
        restaurant.getMeals().add(meal1);
        restaurant.getMeals().add(meal2);
        restaurantRepository.save(restaurant);

        List<Restaurant> restaurants = restaurantRepository.findAll();
        restaurants.stream().forEach(r -> {
            System.out.println(r);
        });

        Assert.assertEquals("We have one restaurant", 1, restaurants.size());
        Assert.assertEquals("Restaurant should have 2 meals", 2, restaurants.get(0).getMeals().size());
    }

}
