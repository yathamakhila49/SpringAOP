package com.paymentprocessing.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggingAspect {
    @Around("execution(* com.paymentprocessing.service.*.*(..))")
    public Object AroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("==========Before Method==============");
        System.out.println("Request Started");
        System.out.println("method Name:"+joinPoint.getSignature().getName());
        System.out.println("Aruments:"+Arrays.toString(joinPoint.getArgs()));
        Object result=joinPoint.proceed();
        System.out.println("========After Method=========");
        System.out.println("Result:"+result);
        System.out.println("Request completed");

        return  result;



    }


}
