package lab5;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ExtraServiceDAO {
    public void save(ExtraService service) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(service);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    public ExtraService findById(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(ExtraService.class, id);
        }
    }
}