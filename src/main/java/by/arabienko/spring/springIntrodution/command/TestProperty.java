package by.arabienko.spring.springIntrodution.command;

import by.arabienko.spring.springIntrodution.bean.Person1;
import by.arabienko.spring.springIntrodution.configuration.MyConfig2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestProperty {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig2.class);
        Person1 person1 = context.getBean("personBean",Person1.class);
        person1.sayPerson();
        System.out.println(person1.getAge()+" "+person1.getName());

        context.close();
    }
}
