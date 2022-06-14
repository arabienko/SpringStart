package by.arabienko.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionHandlingAspect {

    @Before("by.arabienko.spring.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddExceptionPointcutAdvice(){
        System.out.println("beforeAddExceptionPointcutAdvice()...");
        System.out.println("_______________________");
    }
}
