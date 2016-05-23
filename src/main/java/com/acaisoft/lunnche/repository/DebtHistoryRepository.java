package com.acaisoft.lunnche.repository;

import com.acaisoft.lunnche.model.DebtHistory;
import com.acaisoft.lunnche.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DebtHistoryRepository extends CrudRepository<DebtHistory, Long> {
    List<DebtHistory> findAll();
    List<DebtHistory> findByCreditor(User creditor);
    List<DebtHistory> findByDebtor(User debtor);
    List<DebtHistory> findByCreditorOrderByDebtDesc(User creditor);
    List<DebtHistory> findByDebtorOrderByDebtDesc(User debtor);
}
