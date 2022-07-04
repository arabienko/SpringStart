package by.arabienko.hibernate_many_to_many;

import by.arabienko.hibernate_many_to_many.entity.Children;
import by.arabienko.hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Children.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
        Session session = null;

        try {
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
//*****************************************************************************
//            Section section = new Section("basketball");
//            Section section1 = new Section("volleyball");
//            Section section2 = new Section("tennis");
//
//            Children children = new Children("Tatsiana", 25);
//            Children children1 = new Children("Victoria", 28);
//            Children children2 = new Children("Ekaterina", 18);

//            session.persist(section);
//            session.persist(section1);
//            session.persist(section2);
//
//            session.persist(children);
//            session.persist(children1);
//            session.persist(children2);
//*****************************************************************************
//           session.get(Children.class, 1).addSection(session.get(Section.class, 1));
//            session.get(Children.class, 1).addSection(session.get(Section.class, 3));
//            session.get(Children.class, 2).addSection(session.get(Section.class, 1));
//            session.get(Children.class, 2).addSection(session.get(Section.class, 2));
//            session.get(Children.class, 3).addSection(session.get(Section.class, 2));
//            session.get(Children.class, 3).addSection(session.get(Section.class, 3));
//*****************************************************************************

//            Children children = new Children("Valentina", 22);
//            session.get(Section.class, 2).addChildren(children);
//*****************************************************************************
//            Section section = session.get(Section.class, 3);
//            Children children = session.get(Children.class, 4);
//            System.out.println(children);
//            System.out.println(children.getSectionsList());
//*****************************************************************************
//            Section section = session.get(Section.class, 2);
//            Children children = session.get(Children.class, 2);
//            System.out.println(children);
//            System.out.println(children.getSectionsList());
//            session.remove(children);

            Children children = session.get(Children.class, 1);
            children.getSectionsList().remove(session.get(Section.class, 3));
            session.getTransaction().commit();
            System.out.println("DONE!!!!");
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
