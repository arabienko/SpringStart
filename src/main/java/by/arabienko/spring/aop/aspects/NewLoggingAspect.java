package by.arabienko.spring.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: try to return book...");
        Object targetProceedMethodResult;
        try {
            long startTime = System.currentTimeMillis();
            targetProceedMethodResult = proceedingJoinPoint.proceed();
            targetProceedMethodResult="other book";
            long endTime = System.currentTimeMillis();
            System.out.println("aroundReturnBookLoggingAdvice: successful return book...after milli time "+(endTime-startTime));
        }catch (Exception e){
            System.out.println("Throw exception: "+e);
           // targetProceedMethodResult="not name book";
            throw e;
        }
        System.out.println("end work around aspect...");
        return targetProceedMethodResult;
    }
}
