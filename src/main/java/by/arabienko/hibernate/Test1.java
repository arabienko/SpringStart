package by.arabienko.hibernate;

import by.arabienko.hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session =
                    factory.getCurrentSession();
            Employee employee =
                    new Employee("Victor", "Arabiyenka", "IT", 800);
            session.beginTransaction();
            session.save(employee);
            //session.persist(employee);
            session.getTransaction().commit();//closed session
            System.out.println("Creation employee is done success...");
        }
    }
}
