package by.arabienko.hibernate;

import by.arabienko.hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory sessionFactory =
                new Configuration()
                        .configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Employee.class)
                        .buildSessionFactory();
        try {
            Session session = sessionFactory.getCurrentSession();
            Employee employee = new Employee("Tetris", "Tetris", "Tetris", 10);
            session.beginTransaction();
//            List<Employee> employees = session.createQuery("FROM Employee ", Employee.class)
//                            .getResultList();
            List<Employee> employees = session.createQuery("from Employee " +
                    "Where name = 'herry' and salary>600", Employee.class).getResultList();
            for (Employee e : employees) {
                System.out.println(e);
            }

            session.getTransaction().commit();
            System.out.println("DONE!!!");
        } finally {
            sessionFactory.close();
        }
    }
}
