package lab5;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "damage_reports")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DamageReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private double repairCost;

    @OneToOne
    @JoinColumn(name = "order_id")
    private RentalOrder rentalOrder;
}