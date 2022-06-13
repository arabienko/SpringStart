package by.arabienko.spring.springIntrodution.bean.impl;

import by.arabienko.spring.springIntrodution.bean.Pet;
import org.springframework.stereotype.Component;

@Component
public class Frog implements Pet {
    public Frog() {
        System.out.println("Frog is created...");
    }

    @Override
    public void say() {
        System.out.println("frog says qwaaaa...");
    }
}
