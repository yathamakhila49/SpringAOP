package com.calculator.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* com.calculator.service.*.*(..))")
    public void beforeAdvice(JoinPoint joinPoint){
        System.out.println("method Executing:"+joinPoint.getSignature().getName());
        System.out.println("Arguments:"+ Arrays.toString(joinPoint.getArgs()));
    }
}
