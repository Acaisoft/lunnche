package com.acaisoft.lunnche.repository;

import com.acaisoft.lunnche.model.Restaurant;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {

    List<Restaurant> findAll();

}
