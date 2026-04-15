package lab5;

import lombok.*;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "extra_services")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExtraService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;

    @ManyToMany(mappedBy = "services")
    private List<RentalOrder> orders;
}