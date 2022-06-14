package by.arabienko.spring.aop.aspects;

import by.arabienko.spring.aop.Film;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class AspectLogging {

//    @Pointcut("execution(* *())")
//    private void allMethodsPointcut(){}
//
//    @Pointcut("execution(public void by.arabienko.spring.aop.MainLibrary.return*())")
//        private void returnMethodsPointcut(){}
//
//    @Before("allMethodsPointcut() && !returnMethodsPointcut()")
//    public void beforeAllMethodsWithoutReturnAdvice(){
//        System.out.println("beforeAllMethodsWithoutReturnAdvice logging...");
//    }

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


//
//    @Before("allGetMethods()")
//  //  @Before("execution(public void by.arabienko.spring.aop.MainLibrary.get*(*))")
////    @Before("execution(public void by.arabienko.spring.aop.MainLibrary.get*(..))")

    @Before("by.arabienko.spring.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

       MethodSignature methodSignature =(MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature= "+methodSignature);
        System.out.println("methodSignature.getMethod= "+methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType= "+methodSignature.getReturnType());
        System.out.println("methodSignature.getName= "+methodSignature.getName());

        if (methodSignature.getName().equals("addFilm")){
            Object[] args = joinPoint.getArgs();
            for (Object obj : args){
                if (obj instanceof Film){
                    System.out.println("Information about film: "
                            + ((Film) obj).getName() + ", " + ((Film) obj).getProducer()
                    +", "+((Film) obj).getYear());
                }else {
                    System.out.println("Name of person: "+obj);
                }
            }
        }


        System.out.println("beforeAddBookAdvice: attempt add logging to something...");
        System.out.println("_______________________");
    }



}
