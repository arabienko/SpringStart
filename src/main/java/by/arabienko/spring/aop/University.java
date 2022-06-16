package by.arabienko.spring.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component()
public class University {
    private List<Student> students
            =new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }

    public void addStudents(){
        Student st1=new Student("Victor", 5, 5.5);
        Student st2 =new Student("Ekaterina", 4, 3.2);
        Student st3 = new Student("Michail", 2, 5.0);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents(){
        System.out.println("Start working the getStudents method... ");
       // System.out.println(students.get(3));
        System.out.println("Returns list of students...: ");
        System.out.println(students);
        return students;
    }

}
