package com.myorg;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* com.myorg.ShoppingCart.checkout(..))")
    public void beforeLogger(JoinPoint jp)
    {
//        System.out.println(jp.getSourceLocation());
        String arg =  jp.getArgs()[0].toString();
        System.out.println("Before Logger with arguments: " + arg);


    }

    @After("execution(* com.myorg.ShoppingCart.checkout(..))")
    public void afterLogger(){
        System.out.println("After logger");
    }

    @Pointcut("execution(* com.myorg.ShoppingCart.quantity(..))")
    public void afterReturningPointCut(){

    }
    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterReturning(String retVal){
        System.out.println("After returning: " + retVal);
    }
}
