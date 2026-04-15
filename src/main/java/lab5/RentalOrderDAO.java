package lab5;

import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class RentalOrderDAO {
    public void save(RentalOrder order) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(order);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    public RentalOrder findById(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(RentalOrder.class, id);
        }
    }

    public List<RentalOrder> findAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from RentalOrder", RentalOrder.class).list();
        }
    }

    public void update(RentalOrder order) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(order);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {transaction.rollback();}
            e.printStackTrace();
        }
    }

    public void delete(RentalOrder order) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.delete(order);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {transaction.rollback();}
            e.printStackTrace();
        }
    }
}
