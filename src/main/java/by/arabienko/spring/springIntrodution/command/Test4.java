package by.arabienko.spring.springIntrodution.command;

import by.arabienko.spring.springIntrodution.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext");
        Person person = context.getBean("myPerson", Person.class);
        person.callMyPat();
        System.out.println(person.getAge()+" "+ person.getName());
        System.out.println(context.getStartupDate());
        context.close();
    }
}
