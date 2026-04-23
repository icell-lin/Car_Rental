package lab7;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "damage_reports")
@Data
@Builder
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