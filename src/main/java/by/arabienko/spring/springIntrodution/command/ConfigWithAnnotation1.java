package by.arabienko.spring.springIntrodution.command;

import by.arabienko.spring.springIntrodution.bean.impl.CatImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotation1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext4");
        CatImpl cat = context.getBean("catImpl",CatImpl.class);
        cat.say();
        context.close();
    }
}
