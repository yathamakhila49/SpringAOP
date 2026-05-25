package com.ecom.ta.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class PayamentExceptionAspect {

    @AfterThrowing(pointcut = "execution(* com.ecom.ta.service.*.*(..))", throwing = "ex")
    public void logPaymentFailure(JoinPoint joinPoint, Exception ex) {
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();
        log.error("Payment Failed");
        log.error("Method Name : {}", methodName);
        log.error("Input Amount : {}", arguments[0]);
        log.error("Exception Message : {}", ex.getMessage());
    }
}
