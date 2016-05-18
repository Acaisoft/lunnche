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
import com.acaisoft.lunnche.model.PurchaseOrder;
import com.acaisoft.lunnche.model.User;
import com.acaisoft.lunnche.repository.MealRepository;
import com.acaisoft.lunnche.repository.PurchaseOrderRepository;
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
public class PurchaseOrderTest {

    @Autowired
    private PurchaseOrderRepository purchaseOrderRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MealRepository mealRepository;

    @Test
    public void shouldCreateRestaurantWithMeals() {
        Meal meal1 = new Meal();
        meal1.setName("Meal #1");
        meal1.setPrice(10);
        meal1 = mealRepository.save(meal1);

        Meal meal2 = new Meal();
        meal2.setName("Meal #2");
        meal2.setPrice(20);
        meal2 = mealRepository.save(meal2);

        User user1 = new User();
        user1.setFirstName("Name");
        user1.setLastName("Last");
        user1.setBalance(50);
        user1.setUsername("a");
        user1.setPassword("a");
        user1 = userRepository.save(user1);

        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.setUser(user1);
        purchaseOrder.setMeal(meal1);
        purchaseOrderRepository.save(purchaseOrder);

        List<PurchaseOrder> purchaseOrders = purchaseOrderRepository.findAll();
        purchaseOrders.stream().forEach(o -> {
            System.out.println(o);
        });

        Assert.assertEquals("We have one purchaseOrder", 1, purchaseOrders.size());
        Assert.assertEquals("Username is ", "a", purchaseOrder.getUser().getUsername());
        Assert.assertEquals("Meal is ", "Meal #1", purchaseOrder.getMeal().getName());
    }

}
