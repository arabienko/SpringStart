package by.arabienko.spring.springIntrodution.command;

import by.arabienko.spring.springIntrodution.bean.Pat;
import by.arabienko.spring.springIntrodution.bean.impl.CatImpl;

public class Test {
    public static void main(String[] args) {
        Pat dog = new CatImpl();
        dog.say();
    }
}
