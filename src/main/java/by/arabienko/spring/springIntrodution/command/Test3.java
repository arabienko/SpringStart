package by.arabienko.spring.springIntrodution.command;

import by.arabienko.spring.springIntrodution.bean.Person;
import by.arabienko.spring.springIntrodution.bean.Pet;
import by.arabienko.spring.springIntrodution.bean.impl.CatImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext");
       // Pet pet = context.getBean("myPet", Pet.class);
       //Pet pet = new CatImpl();
        //Person person = new Person(pet);
        Person person = context.getBean("myPerson", Person.class);
        person.callMyPat();
        context.close();
    }

}
