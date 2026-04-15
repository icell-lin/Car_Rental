package lab5;


import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            System.out.println("Hibernate підключився до бази.");
        } catch (Exception e) {
            System.err.println("Щось пішло не так:");
            e.printStackTrace();
        }
    }
}