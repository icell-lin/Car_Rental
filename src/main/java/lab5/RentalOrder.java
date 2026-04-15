package lab5;

import lab4.pract2.OrderState;
import lombok.*;
import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "rental_orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RentalOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String startDate;
    private String endDate;
    private String status;
    private String paymentStatus;
    private String rejectionReason;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Administrator administrator;

    @OneToOne(mappedBy = "rentalOrder", cascade = CascadeType.ALL)
    private DamageReport damageReport;

    @Transient
    private OrderState state;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "order_services",
            joinColumns = { @JoinColumn(name = "order_id") },
            inverseJoinColumns = { @JoinColumn(name = "service_id") }
    )
    private List<ExtraService> services;
}
