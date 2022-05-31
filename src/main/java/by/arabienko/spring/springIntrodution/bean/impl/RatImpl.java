package by.arabienko.spring.springIntrodution.bean.impl;

import by.arabienko.spring.springIntrodution.bean.Pet;

public class RatImpl implements Pet {
    public RatImpl() {
        System.out.println("Rat is created...");
    }

    @Override
    public void say() {
        System.out.println("Rat is pipi...");
    }
    //both protected or privet
    public void init(){
        System.out.println("class Rat, init method...");
    }
    public void destroy(){
        System.out.println("class Rat, destroy method...");
    }
}
