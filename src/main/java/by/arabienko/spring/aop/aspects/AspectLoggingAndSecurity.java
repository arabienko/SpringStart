package by.arabienko.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectLoggingAndSecurity {

    @Pointcut("execution(* *())")
    private void allMethodsPointcut(){}

    @Pointcut("execution(public void by.arabienko.spring.aop.MainLibrary.return*())")
        private void returnMethodsPointcut(){}

    @Before("allMethodsPointcut() && !returnMethodsPointcut()")
    public void beforeAllMethodsWithoutReturnAdvice(){
        System.out.println("beforeAllMethodsWithoutReturnAdvice logging...");
    }

//    @Pointcut("execution(void get*())")
//    private void getMethodsPointcut() {
//    }
//
//    @Before("getMethodsPointcut()")
//    public void beforeGetMethodsPointcutAdvice(){
//        System.out.println("getMethodsPointcutAdvice...writing log#1");
//    }
//
//    @Pointcut("execution(* add*())")
//    private void addMethodsPointcut() {
//        System.out.println("addMethodsPointcut...");
//    }
//
//    @Before("addMethodsPointcut()")
//    public void beforeAddMethodsPointcutAdvice(){
//        System.out.println("beforeAddMethodsPointcutAdvice...writing log#2");
//    }
//
//
//    @Pointcut("addMethodsPointcut() || getMethodsPointcut()")
//    private void allGetAndAddMethodsPointcut() {
//    }
//
//    @Before("allGetAndAddMethodsPointcut()")
//    public void beforeAllMethodsPointcutAdvice(){
//        System.out.println("beforeAllMethodsPointcutAdvice...writing log#3");
//    }

//    @Pointcut("execution(* get*())")
//    private void allGetMethods(){};
//
//    @Before("allGetMethods()")
//  //  @Before("execution(public void by.arabienko.spring.aop.MainLibrary.get*(*))")
////    @Before("execution(public void by.arabienko.spring.aop.MainLibrary.get*(..))")
////    @Before("execution(public void by.arabienko.spring.aop.MainLibrary.get*(by.arabienko.spring.aop.Book))")
//
//    public void beforeLoggingAdvice(){
//        System.out.println("beforeGetBookAdvice: attempt to get book...");
//    }
//
//    @Before("allGetMethods()")
//    public void beforeSecurityAdvice(){
//        System.out.println("Checking is ...");
//    }
}
