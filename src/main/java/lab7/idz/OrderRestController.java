package lab7.idz;

import lab7.RentalOrder;
import lab7.repository.RentalOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin(origins = "*")
public class OrderRestController {

    @Autowired
    private RentalOrderRepository orderRepository;

    @GetMapping
    public List<RentalOrder> getAllOrders() {
        return orderRepository.findAll();
    }
}