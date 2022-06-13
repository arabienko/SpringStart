package by.arabienko.spring.springIntrodution.bean;

import by.arabienko.spring.springIntrodution.bean.impl.Frog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personAuto")
public class PersonAuto {
    @Autowired
    private Frog frog;
    private String name;
    private int age;

    public PersonAuto() {
        System.out.println("Constructor PersonAuto without arguments...");
    }

//    @Autowired
//    public PersonAuto(Frog frog) {
//        System.out.println("PersonAuto is created...");
//        this.frog = frog;
//    }

    public void personAutoSay() {
        System.out.println("PersonAuto say something...");
    }

    public Frog getFrog() {
        return frog;
    }

//    @Autowired
    public void setFrog(Frog frog) {
        System.out.println("Setter Frog in PersonAuto");
        this.frog = frog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
