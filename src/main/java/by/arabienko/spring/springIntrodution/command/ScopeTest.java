package by.arabienko.spring.springIntrodution.command;

import by.arabienko.spring.springIntrodution.bean.impl.DogImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext4");
        DogImpl dog = context.getBean("dog",DogImpl.class);
        DogImpl dog1 = context.getBean("dog",DogImpl.class);
        System.out.println("is the same bean? "+ (dog == dog1));
        context.close();
    }
}
