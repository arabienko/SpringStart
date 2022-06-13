package by.arabienko.spring.springIntrodution.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person1 {
    //    @Autowired
//    @Qualifier("catBean")
    private Pet pet;
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;


//    public Person1(@Qualifier("catBean") Pet pet) {
//        this.pet = pet;
//        System.out.println("Person1 is created with arg...");
//    }
    public Person1(Pet pet) {
        this.pet = pet;
        System.out.println("Person1 is created with arg...: "+pet);
    }

    public Pet getPet() {
        return pet;
    }

//    @Autowired
//    @Qualifier("dog")
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void sayPerson() {
        System.out.println("Person1 says something...");
        pet.say();
    }

    public String getName() {
        System.out.println("getName Person1...");
        return name;
    }

    public void setName(String name) {
        System.out.println("setName Person1...");
        this.name = name;
    }

    public int getAge() {
        System.out.println("getAge Person1...");
        return age;
    }

    public void setAge(int age) {
        System.out.println("setAge Person1...");
        this.age = age;
    }
}
