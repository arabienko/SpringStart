package by.arabienko.spring.springIntrodution.command;

import by.arabienko.spring.springIntrodution.bean.Person;
import by.arabienko.spring.springIntrodution.bean.Pet;
import by.arabienko.spring.springIntrodution.bean.impl.DogImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        DogImpl myDog = context.getBean("myPet", DogImpl.class);
        myDog.setName("Strelka");
        DogImpl noDog = context.getBean("myPet", DogImpl.class);
        noDog.setName("Belka");
        System.out.println("Is it the same dog? "+ (myDog==noDog));
        System.out.println(myDog.getName());
        System.out.println(noDog.getName());
        System.out.println(myDog);
        System.out.println(noDog);
        context.close();
    }
}
