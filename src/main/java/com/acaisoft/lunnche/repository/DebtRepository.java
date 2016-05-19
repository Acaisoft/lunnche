package com.acaisoft.lunnche.repository;

import com.acaisoft.lunnche.model.Debt;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DebtRepository extends CrudRepository<Debt, Long> {
    List<Debt> findAll();
}
