package com.acaisoft.lunnche.repository;

import com.acaisoft.lunnche.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
