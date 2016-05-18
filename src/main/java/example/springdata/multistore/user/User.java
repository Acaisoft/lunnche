package example.springdata.multistore.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor


public class User {
    private @Id @GeneratedValue Long id;
    private final String firstName;
    private final String lastName;
    private final double balance;
    private final String username;
    private final String password;

    protected User(){this( null, null, 0, null, null);}
}
