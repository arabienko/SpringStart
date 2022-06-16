package by.arabienko.spring.aop.aspects;

import by.arabienko.spring.aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class AspectUniversityLogging {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice(){
        System.out.println("beforeGetStudentsLoggingAdvice: logging before...");
    }

//    @AfterReturning(pointcut = "execution(* get*(..))",
//    returning = "students")
//    public void afterGetStudentLoggingAdvice(List<Student> students){
//        Student firstStudent = students.get(0);
//        String name = firstStudent.getName();
//        name = "Mr. " + name;
//        firstStudent.setName(name);
//        System.out.println("afterGetStudentLoggingAdvice: logging after...");
//    }
    @AfterThrowing(pointcut = "execution(* get*(..))",
    throwing = "exception")
    public void afterThrowingGetStudentsAdvice(Throwable exception){
        System.out.println("afterThrowingGetStudentsAdvice..." + exception);
    }

    @After("execution(* get*(..))")
    public void afterGetStudentsAdvice(){
        System.out.println("afterGetStudentsAdvice: normal finish program...");
    }
}
