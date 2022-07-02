package by.arabienko.hibernate_one_to_many_uni;


import by.arabienko.hibernate_one_to_many_uni.entity.Department;
import by.arabienko.hibernate_one_to_many_uni.entity.Employees;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {
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

//            Department department = new Department(1000, 2500, "HR");
//            Employees employees = new Employees("Victor", "Matusevich");
//            Employees employees1 = new Employees("Katyaryna", "Arabiyenka");
////
//            department.addEmployeeToDepartment(employees);
//            department.addEmployeeToDepartment(employees1);
//
//            session.persist(department);
//
//            Department department  =session.get(Department.class, 3);
//            System.out.println(department);
//            System.out.println(department.getEmployeesList());

//            Employees employees = session.get(Employees.class, 2);
//            System.out.println(employees);

            Department department = session.get(Department.class, 1);
            session.remove(department);
            System.out.println(department);
            session.getTransaction().commit();//closed session
            System.out.println("Creation employee is done success...");
        } finally {
            assert session!=null;
            session.close();
            factory.close();
        }
    }
}
