package com.acaisoft.lunnche.repository;

import com.acaisoft.lunnche.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findAll();
}
