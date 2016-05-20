package com.acaisoft.lunnche;

import com.acaisoft.lunnche.model.Meal;
import com.acaisoft.lunnche.model.Restaurant;
import com.acaisoft.lunnche.repository.RestaurantRepository;
import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@Transactional
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class,
        TransactionalTestExecutionListener.class,
        DbUnitTestExecutionListener.class})
@DatabaseSetup("/test-entries.xml")
public class RestaurantIntegrationTest {

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Test
    public void shouldCreateRestaurantWithMeals() {
        List<Restaurant> restaurants = restaurantRepository.findAll();
        restaurants.stream().forEach(System.out::println);

        Assert.assertEquals("Rrestaurants number", 1, restaurants.size());
        Assert.assertEquals("Restaurant name", "Restaurant #1", restaurants.get(0).getName());
        Assert.assertEquals("Restaurant meals", 2, restaurants.get(0).getMeals().size());
    }


}
