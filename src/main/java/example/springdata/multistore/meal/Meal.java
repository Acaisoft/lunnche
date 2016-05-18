package example.springdata.multistore.meal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor


public class Meal {
    private @Id @GeneratedValue Long id;
    private final String name;
    private final double price;
    private final String restaurant;

    protected Meal(){this(null,0, null);}
}
