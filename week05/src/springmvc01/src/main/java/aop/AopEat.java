package aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 通过xml添加AOP
 */
public class AopEat {

    public void startEat() {
        System.out.println("饭前");
    }

    public void endEat() {
        System.out.println("饭后");
    }

    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("饭前");

        joinPoint.proceed();

        System.out.println("饭后");
    }
}
