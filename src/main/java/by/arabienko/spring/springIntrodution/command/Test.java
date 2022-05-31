package by.arabienko.spring.springIntrodution.command;

import by.arabienko.spring.springIntrodution.bean.Pet;
import by.arabienko.spring.springIntrodution.bean.impl.CatImpl;

public class Test {
    public static void main(String[] args) {
        Pet dog = new CatImpl();
        dog.say();
    }
}
