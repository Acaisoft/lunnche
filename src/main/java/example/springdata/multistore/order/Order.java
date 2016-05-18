package example.springdata.multistore.order;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor

public class Order {
    private @Id @GeneratedValue Long id;
    private final String name;

    protected Order(){this(null);}
}
