package lab5;

import lombok.*;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "administrators")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Administrator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String login;
    private String password;

    @OneToMany(mappedBy = "administrator")
    private List<RentalOrder> orderList;
}