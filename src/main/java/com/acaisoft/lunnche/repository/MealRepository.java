package com.acaisoft.lunnche.repository;

import com.acaisoft.lunnche.model.Meal;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MealRepository extends CrudRepository<Meal,Long> {

    List<Meal> findAll();

}
