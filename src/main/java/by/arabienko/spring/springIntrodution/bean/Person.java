package by.arabienko.spring.springIntrodution.bean;

public class Person {
    private Pet pet;
    private String name;
    private int age;

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

    /* public Person(Pet pet) {
            System.out.println("Person bean is created.");
            this.pet = pet;
        }*/
    public Person() {
        System.out.println("Person bean is created.");
    }

    public void callMyPat() {
        System.out.println("call my pat, please...");
       pet.say();
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
