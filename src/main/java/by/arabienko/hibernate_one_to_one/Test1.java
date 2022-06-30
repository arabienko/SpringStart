package by.arabienko.hibernate_one_to_one;

import by.arabienko.hibernate_one_to_one.entity.Details;
import by.arabienko.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        Session session = null;
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Details.class)
                .buildSessionFactory();

        try {
            session =
                    factory.getCurrentSession();

//            Employee employee = new Employee("Tatsiana", "Arabiyenka", "IT", 1500);
//            Details details = new Details("Minsk", "+375295772890","t.v.arabienko@tut.by");
//            employee.setDetails(details);


//            Employee employee = new Employee("Oleg", "Olegovich", "Sales", 2000);
//            Details details = new Details("Minsk", "+375335602525","oleg@tut.by");
//            employee.setDetails(details);
//            session.beginTransaction();
//            session.persist(employee);
//            session.getTransaction().commit();//closed session

            session.beginTransaction();
            Employee employee = session.get(Employee.class, 2);
            System.out.println(employee.getDetails());
            System.out.println(employee);
            session.remove(employee);
            session.getTransaction().commit();//closed session
            System.out.println("Creation employee is done success...");
        }finally {
            assert session!=null;
            session.close();
            factory.close();
        }
    }
}
