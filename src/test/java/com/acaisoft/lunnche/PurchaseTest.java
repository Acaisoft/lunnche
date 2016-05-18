package com.acaisoft.lunnche;

import com.acaisoft.lunnche.model.*;
import com.acaisoft.lunnche.repository.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@Transactional
public class PurchaseTest {

    @Autowired
    private PurchaseOrderRepository purchaseOrderRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MealRepository mealRepository;

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Autowired
    private PurchaseRepository purchaseRepository;

    @Test
    public void shouldCreateFullPurchase() {
        User user1 = new User();
        user1.setFirstName("F");
        user1.setLastName("L");
        user1.setBalance(50);
        user1.setUsername("user");
        user1.setPassword("pass");
        userRepository.save(user1);

        Restaurant restaurant = new Restaurant();
        restaurant.setName("Restaurant #1");
        restaurantRepository.save(restaurant);

        Meal meal1 = new Meal();
        meal1.setName("Meal #1");
        meal1.setPrice(10);
        meal1.setRestaurant(restaurant);
        mealRepository.save(meal1);

        Purchase purchase = new Purchase();
        purchaseRepository.save(purchase);

        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.setUser(user1);
        purchaseOrder.setMeal(meal1);
        purchaseOrder.setPurchase(purchase);
        purchaseOrderRepository.save(purchaseOrder);

        List<Purchase> purchases = purchaseRepository.findAll();
        purchases.stream().forEach(System.out::println);

        Assert.assertEquals("We have one", 1, purchases.size());
    }

}
