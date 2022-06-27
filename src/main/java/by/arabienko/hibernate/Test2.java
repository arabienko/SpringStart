package by.arabienko.hibernate;

import by.arabienko.hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = sessionFactory.getCurrentSession();
            Employee emp = new Employee("Kate","Henderson","HR",800);
            session.beginTransaction();
            session.persist(emp);
            session.getTransaction().commit();
            System.out.println("Creation employee is done success...");
            int myId = emp.getId();
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            Employee employee = session.get(Employee.class, myId);
            System.out.println(employee);
            session.getTransaction().commit();
        }finally {
            sessionFactory.close();
        }

    }
}
