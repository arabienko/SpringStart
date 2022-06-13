package by.arabienko.spring.springIntrodution.command;

import by.arabienko.spring.springIntrodution.bean.Person1;
import by.arabienko.spring.springIntrodution.configuration.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Person1 person1 = context.getBean("person1", Person1.class);
        person1.sayPerson();
        context.close();
    }
}
