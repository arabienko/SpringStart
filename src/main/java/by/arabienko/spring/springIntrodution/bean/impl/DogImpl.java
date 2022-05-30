package by.arabienko.spring.springIntrodution.bean.impl;

import by.arabienko.spring.springIntrodution.bean.Pat;

public class DogImpl implements Pat {
    @Override
    public void say() {
        System.out.println("Wow-wow");
    }
}
