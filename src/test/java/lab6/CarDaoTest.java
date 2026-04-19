package lab6;

import lab5.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class CarDaoTest {
    private CarDAO hqlDao;
    private CarDAO sqlDao;

    @BeforeEach
    void setUp() {
        hqlDao = new HqlCarDAO();
        sqlDao = new SqlCarDAO();
    }

    @Test
    void testHqlAndSqlConsistency() {
        Car car = new Car();
        car.setBrand("Porsche");
        car.setModel("911");
        car.setPricePerDay(500.0);

        hqlDao.save(car);

        List<Car> hqlResults = hqlDao.findByBrand("Porsche");

        List<Car> sqlResults = sqlDao.findByBrand("Porsche");

        assertFalse(hqlResults.isEmpty(), "HQL мав знайти машину");
        assertFalse(sqlResults.isEmpty(), "SQL мав знайти машину");
        assertEquals(hqlResults.size(), sqlResults.size(), "Кількість знайдених авто має бути однаковою");
        assertEquals(hqlResults.get(0).getModel(), sqlResults.get(0).getModel());

        System.out.println("Тест пройдено");
    }
}