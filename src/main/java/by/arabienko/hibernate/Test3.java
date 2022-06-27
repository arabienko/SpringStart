package by.arabienko.hibernate;

import by.arabienko.hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session =
                    sessionFactory.getCurrentSession();
            Employee employee = new Employee("Herry", "Potter", "Wizzard",1000);
            session.beginTransaction();
            session.persist(employee);
            Employee employee1 = session.get(Employee.class, employee.getId());
            session.getTransaction().commit();
            System.out.println(employee1);
            System.out.println("DONE!!!");
        }finally {
            sessionFactory.close();
        }
    }
}
