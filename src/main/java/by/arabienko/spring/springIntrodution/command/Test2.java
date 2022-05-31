package by.arabienko.spring.springIntrodution.command;

import by.arabienko.spring.springIntrodution.bean.Pet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext");
        Pet dog = context.getBean("myPet", Pet.class);
        dog.say();
        context.close();
    }
}
