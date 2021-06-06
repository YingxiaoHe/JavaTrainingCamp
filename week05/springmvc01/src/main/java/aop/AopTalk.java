package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 通过注解添加AOP
 */
@Aspect
public class AopTalk {

    @Pointcut(value = "execution(* model.Animal.talk(..))")
    public void point() {

    }

    @Before(value = "point()")
    public void beforeTalk() {
        System.out.println("讲话前");
    }

    @After(value = "point()")
    public void afterTalk() {
        System.out.println("讲话后");
    }

    @Around(value = "point()")
    public void aroundTalk(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("讲话前");
        joinPoint.proceed();
        System.out.println("讲话后");
    }
}
