package by.arabienko.spring.springIntrodution.bean.impl;

import by.arabienko.spring.springIntrodution.bean.Pet;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("dog")
@Scope("prototype")
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

    @PostConstruct
    public void init(){
        System.out.println("class Dog, init method...");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("class Dg, destroy method...");
    }
}
