package by.arabienko.spring.springIntrodution.bean.impl;

import by.arabienko.spring.springIntrodution.bean.Pet;
import org.springframework.stereotype.Component;

@Component
//        ("catBean")
public class CatImpl implements Pet {
    public CatImpl() {
        System.out.println("Cat is created...");
    }

    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
