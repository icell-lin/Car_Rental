package lab6;

import lab5.Car;
import lab5.HibernateUtil;
import org.hibernate.Session;
import java.util.List;

public class SqlCarDAO implements CarDAO {
    @Override
    public List<Car> findByBrand(String brand) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // Native SQL запит (до таблиці cars)
            String sql = "SELECT * FROM cars WHERE brand = :brandName";
            return session.createNativeQuery(sql, Car.class)
                    .setParameter("brandName", brand)
                    .getResultList();
    }
}
