package com.onlinepayemnt.aspect;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingAspect {
    @After("execution(* com.onlinepayemnt.service.*.*(..))")
        public void afterAdvice(JoinPoint joinPoint){

        System.out.println("Request Completed");
            System.out.println("Payment Method Completed : " + joinPoint.getSignature().getName());
            log.info("Payment Method Completed : {} ",joinPoint.getSignature().getName());
        }
    }

