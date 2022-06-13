package by.arabienko.spring.springIntrodution.command;

import by.arabienko.spring.springIntrodution.bean.Person1;
import by.arabienko.spring.springIntrodution.bean.Pet;
import by.arabienko.spring.springIntrodution.bean.impl.CatImpl;
import by.arabienko.spring.springIntrodution.configuration.MyConfig;
import by.arabienko.spring.springIntrodution.configuration.MyConfig2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConfig2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig2.class);
//        Pet cat = context.getBean("catBean",CatImpl.class);
//        Pet cat2 = context.getBean("catBean",CatImpl.class);
        Person1 person1 = context.getBean("personBean",Person1.class);
        person1.sayPerson();

        //cat.say();
        context.close();
    }
}
