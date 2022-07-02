package by.arabienko.hibernate_one_to_many_bi;

import by.arabienko.hibernate_one_to_many_bi.entity.Department;
import by.arabienko.hibernate_one_to_many_bi.entity.Employees;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test3 {
    public static void main(String[] args) {
        Session session = null;
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employees.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        try {
            session =
                    factory.getCurrentSession();
            session.beginTransaction();

//            Department department = new Department(1000, 2000, "IT");
//            Employees employees = new Employees("Tatsiana", "Arabiyenka");
//            Employees employees1 = new Employees("Katyaryna", "Arabiyenka");
//
//            department.addEmployeeToDepartment(employees);
//            department.addEmployeeToDepartment(employees1);

//            Department department = new Department(1000, 1500, "sale");
//            Employees employees = new Employees("Tatsiana", "Matusevich");
//            Employees employees1 = new Employees("Katyaryna", "Matusevich");

//            department.addEmployeeToDepartment(employees);
//            department.addEmployeeToDepartment(employees1);

//            Department department = session.get(Department.class, 2);
//            Employees employees = session.get(Employees.class, 1);
//
//            System.out.println(employees);
//            System.out.println(employees.getDepartment());

            Employees employees = session.get(Employees.class, 2);
            session.remove(employees);

            session.getTransaction().commit();//closed session
            System.out.println("Creation employee is done success...");
        } finally {
            assert session!=null;
            session.close();
            factory.close();
        }
    }
}
