package example.springdata.multistore.restaurant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@RequiredArgsConstructor

public class Restaurant {
    private @Id @GeneratedValue Long id;
    private final String name;

    protected Restaurant(){this(null);}
}
