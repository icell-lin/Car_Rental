package lab7;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cars")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
    private String model;

    @Column(name = "year_graduation")
    private int yearGraduation;

    @Column(name = "price_per_day")
    private double pricePerDay;

    @Column(name = "is_available")
    private boolean isAvailable;

    @Column(columnDefinition = "TEXT")
    private String description;

    @OneToMany(mappedBy = "car")
    private List<RentalOrder> orderList;
}