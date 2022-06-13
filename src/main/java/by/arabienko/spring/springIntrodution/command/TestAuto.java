package by.arabienko.spring.springIntrodution.command;

import by.arabienko.spring.springIntrodution.bean.Person1;
import by.arabienko.spring.springIntrodution.bean.PersonAuto;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAuto {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext4");
        PersonAuto personAuto = context.getBean("personAuto",PersonAuto.class);
        personAuto.personAutoSay();
        Person1 person1 = context.getBean("person1",Person1.class);
        person1.sayPerson();
        System.out.println(person1.getAge()+" "+ person1.getName());

        context.close();


    }
}
