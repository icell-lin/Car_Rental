package lab6;
import lab5.Car;
import lab5.HibernateUtil;
import org.hibernate.Session;
import java.util.List;

public class HqlCarDAO implements CarDAO {
    @Override
    public void save(Car car) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(car);
            session.getTransaction().commit();
        }
    }

    @Override
    public List<Car> findAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM Car", Car.class).list();
        }
    }

    @Override
    public List<Car> findByBrand(String brand) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM Car c WHERE c.brand = :brandName", Car.class)
                    .setParameter("brandName", brand)
                    .list();
        }
    }
}
