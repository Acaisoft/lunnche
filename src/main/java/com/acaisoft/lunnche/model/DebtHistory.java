package com.acaisoft.lunnche.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@ToString
public class DebtHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @OneToOne
    private User creditor;

    @NotNull
    @OneToOne
    private User debtor;

    @NotNull
    private double debt;
}
