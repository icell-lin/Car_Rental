package lab5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarRentalTest {
    @Test
    public void testDatabaseConnection() {
        CarDAO carDao = new CarDAO();
        Car car = new Car();
        car.setBrand("BMW");
        car.setModel("M5");

        carDao.save(car);

        Car saved = carDao.findById(car.getId());
        assertNotNull(saved);
        assertEquals("BMW", saved.getBrand());
    }

    @Test
    public void testExtraService() {
        ExtraServiceDAO serviceDao = new ExtraServiceDAO();
        ExtraService service = new ExtraService();
        service.setName("Дитяче крісло");
        service.setPrice(200.0);

        serviceDao.save(service);
        assertNotNull(service.getId());
    }
}