package lab6;

import lab5.Car;
import java.util.List;

public interface CarDAO {

    void save(Car car);
    List<Car> findByBrand(String brand);
    List<Car> findAll();
}