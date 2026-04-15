package lab5;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class AdministratorDAO {
    public void save(Administrator admin){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            session.save(admin);
            transaction.commit();
        }catch (Exception e ){
            transaction.rollback();
        }

    }

    public Administrator findById(Long id){
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            return session.get(Administrator.class, id);
        }
    }

    public List<Administrator> findAll(){
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Administrator", Administrator.class).list();
        }
    }

    public void update(Administrator admin){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            session.update(admin);
            transaction.commit();
        }catch (Exception e){
            if(transaction != null){transaction.rollback();}
            e.printStackTrace();
        }

    }

    public void delete(Administrator admin){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            session.delete(admin);
            transaction.commit();
        }catch (Exception e){
            if(transaction != null){transaction.rollback();}
            e.printStackTrace();
        }

    }
}
