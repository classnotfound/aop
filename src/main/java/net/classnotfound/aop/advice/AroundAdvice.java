package net.classnotfound.aop.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {

    public Object doBasicProfiling(final ProceedingJoinPoint pjp) throws Throwable {
        // start stopwatch
        System.out.println("Start advice...");
        Object retVal = pjp.proceed();
        // stop stopwatch
        System.out.println("Finished advice!");
        return retVal;
    }
}