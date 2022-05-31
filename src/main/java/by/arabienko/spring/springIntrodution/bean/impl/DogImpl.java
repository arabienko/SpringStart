package by.arabienko.spring.springIntrodution.bean.impl;

import by.arabienko.spring.springIntrodution.bean.Pet;

public class DogImpl implements Pet {

    private String name;
    public DogImpl() {
        System.out.println("Dog is created.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("Wow-wow");
    }
}
