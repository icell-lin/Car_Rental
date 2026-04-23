package lab7.service;

import lab7.RentalOrder;
import lab7.repository.CarRepository;
import lab7.repository.RentalOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RentalFacade {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private RentalOrderRepository orderRepository;

    @Autowired
    private RentalService rentalService;

    @Transactional
    public RentalOrder createBooking(Long carId, Integer days) {
        var car = carRepository.findById(carId)
                .orElseThrow(() -> new RuntimeException("Авто не знайдено"));

        RentalOrder order = RentalOrder.builder()
                .status("PENDING")
                .build();

        Double totalPrice = rentalService.calculateFinalPrice(car.getPricePerDay(), days);

        RentalOrder savedOrder = orderRepository.save(order);
        rentalService.processOrder(savedOrder);

        return savedOrder;
    }
}




