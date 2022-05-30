package by.arabienko.spring.springIntrodution.command;

import by.arabienko.spring.springIntrodution.bean.Pat;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext");
        Pat dog = context.getBean("myPat",Pat.class);
        dog.say();
        context.close();
    }
}
