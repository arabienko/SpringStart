package by.arabienko.hibernate_one_to_one;

import by.arabienko.hibernate_one_to_one.entity.Details;
import by.arabienko.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Objects;

public class Test2 {
    public static void main(String[] args) {

        Session session = null;

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Details.class)
                .buildSessionFactory()) {
            session =
                    factory.getCurrentSession();

//            Employee employee = new Employee("Nicolay", "Niko", "Manager", 1000);
//            Details details = new Details("Hrodno", "+375336999898", "hrodno_niko@tut.by");
//            details.setEmployee(employee);
//            employee.setDetails(details);

//            Employee employee = new Employee("Oleg", "Olegovich", "Sales", 2000);
//            Details details = new Details("Minsk", "+375335602525","oleg@tut.by");
//            employee.setDetails(details);
//            session.beginTransaction();
//            session.persist(employee);
//            session.getTransaction().commit();//closed session

            session.beginTransaction();
//            session.persist(details);
//        Employee employee = session.get(Employee.class, 2);
            Details details = session.get(Details.class, 5);
            System.out.println(details.getEmployee());
            System.out.println(details);
//        session.remove(employee);
            session.remove(details);
            session.getTransaction().commit();//closed session
            System.out.println("Creation employee is done success...");
        } finally {
            Objects.requireNonNull(session).close();
        }
    }
}
