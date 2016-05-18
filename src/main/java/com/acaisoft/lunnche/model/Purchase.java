package com.acaisoft.lunnche.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@ToString
public class Purchase {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "purchase")
    private List<PurchaseOrder> purchaseOrders = new ArrayList<>();

}
