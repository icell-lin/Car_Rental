package lab6;

import lab5.Car;
import lab5.HibernateUtil;
import org.hibernate.Session;
import java.util.List;

public class SqlCarDAO implements CarDAO {
    @Override
    public void save(Car car) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();

            // Оце і все! Hibernate сам згенерує SQL-запит за тебе
            session.save(car);

            session.getTransaction().commit();
        }
    }

    @Override
    public List<Car> findAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // Native SQL запит до ТАБЛИЦІ cars
            String sql = "SELECT * FROM cars";
            return session.createNativeQuery(sql, Car.class).getResultList();
        }
    }

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
}
