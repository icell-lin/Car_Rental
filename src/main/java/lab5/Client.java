package lab5;

import lombok.*;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clients")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String passportNumber;
    private String phone;
    private String email;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<RentalOrder> orderList;
}