package by.arabienko.hibernate;

import by.arabienko.hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session =
                    factory.getCurrentSession();
            Employee employee =
                    new Employee("Tanya", "Arabiyenka", "DSG", 500);
            session.beginTransaction();
            session.save(employee);
            //session.persist(employee);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }

    }
}
