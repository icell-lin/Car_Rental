package lab7.service;

import lab7.RentalOrder;
import lab7.service.state.*;
import org.springframework.stereotype.Service;

@Service
public class RentalService {

    public void processOrder(RentalOrder order) {
        System.out.println("Обробка замовлення " + order.getId());
    }
    public Double calculateFinalPrice(Double basePrice, Integer days) {
        if (days > 7) return (basePrice * days) * 0.8;
        return basePrice * days;
    }
}