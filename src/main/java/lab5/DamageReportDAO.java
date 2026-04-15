package lab5;

import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class DamageReportDAO {
    public void save(DamageReport report) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(report);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    public DamageReport findById(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(DamageReport.class, id);
        }
    }

    public List<DamageReport> findAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from DamageReport", DamageReport.class).list();
        }
    }

    public void update(DamageReport report) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(report);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {transaction.rollback();}
            e.printStackTrace();
        }
    }

    public void delete(DamageReport report) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.delete(report);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {transaction.rollback();}
            e.printStackTrace();
        }
    }
}
