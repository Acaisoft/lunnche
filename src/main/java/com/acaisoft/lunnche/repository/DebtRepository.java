package com.acaisoft.lunnche.repository;

import com.acaisoft.lunnche.model.Debt;
import com.acaisoft.lunnche.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DebtRepository extends CrudRepository<Debt, Long> {
    List<Debt> findAll();
    List<Debt> findByCreditor(User creditor);
    List<Debt> findByCreditorOrderByDebtDesc(User creditor);
    List<Debt> findByDebtorOrderByDebtDesc(User debtor);
}
