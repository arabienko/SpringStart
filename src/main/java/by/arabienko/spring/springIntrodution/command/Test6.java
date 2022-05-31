package by.arabienko.spring.springIntrodution.command;

import by.arabienko.spring.springIntrodution.bean.Person;
import by.arabienko.spring.springIntrodution.bean.impl.RatImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3");
        RatImpl rat = context.getBean("myPet",RatImpl.class);
        RatImpl noRat = context.getBean("myPet",RatImpl.class);
        Person person = context.getBean("myPerson", Person.class);
        System.out.println(person.getAge()+" "+person.getName());
        rat.say();
        noRat.say();
        context.close();
    }
}
