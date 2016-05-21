package com.acaisoft.lunnche.repository;

import com.acaisoft.lunnche.model.PurchaseOrder;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PurchaseOrderRepository extends CrudRepository<PurchaseOrder, Long> {

    List<PurchaseOrder> findAll();

}
