package lab7.idz; // або controller, куди ти його поклав

import lab7.Car;
import lab7.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@CrossOrigin(origins = "*")
public class CarRestController {

    @Autowired
    private CarRepository carRepository;

    @GetMapping
    public List<Car> getAllCars() {
        System.out.println("--- пішов запит на список машин ---");
        return carRepository.findAll();
    }

    // додавання
    @PostMapping
    public Car createCar(@RequestBody Car car) {
        System.out.println("зберігаємо нову машину: " + car.getBrand());
        return carRepository.save(car);
    }

    @PutMapping("/{id}")
    public Car updateCar(@PathVariable Long id, @RequestBody Car updCar) {
        Car c = carRepository.findById(id).orElseThrow();
        c.setBrand(updCar.getBrand());
        c.setModel(updCar.getModel());
        c.setPricePerDay(updCar.getPricePerDay());

        return carRepository.save(c);
    }

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable Long id) {
        carRepository.deleteById(id);
    }
}