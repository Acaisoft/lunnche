package com.acaisoft.lunnche.repository;

import com.acaisoft.lunnche.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
