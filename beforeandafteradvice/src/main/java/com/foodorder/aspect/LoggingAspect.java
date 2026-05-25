package com.foodorder.aspect;



import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.foodorder.service.*.*(..))")
    public void beforeadvice(JoinPoint joinPoint){
        System.out.println("========Before Advice============");
        System.out.println("Request Started");
       System.out.println("Method:"+joinPoint.getSignature().getName());
        System.out.println("Arguments:"+ Arrays.toString(joinPoint.getArgs()));
    }
    @After("execution(* com.foodorder.service.*.*(..))")
    public void afteradvice(JoinPoint joinPoint){
        System.out.println("==============After Advice==========");
        System.out.println("Request Completed");
        System.out.println("method completed:"+joinPoint.getSignature().getName());
    }


}
