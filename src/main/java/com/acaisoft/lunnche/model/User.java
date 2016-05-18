package com.acaisoft.lunnche.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@ToString
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private final String firstName;

    @NonNull
    private final String lastName;

    @NonNull
    private double balance;

    @NonNull
    private final String username;

    @NonNull
    private final String password;
}
