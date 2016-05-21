package com.acaisoft.lunnche.repository;

import com.acaisoft.lunnche.model.Purchase;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PurchaseRepository extends CrudRepository<Purchase, Long> {

    List<Purchase> findAll();

}
