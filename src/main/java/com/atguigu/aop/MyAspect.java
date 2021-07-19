package com.atguigu.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author:
 * @CreateTime: 2021/7/16
 * @company:
 */
@Component
@Aspect
public class MyAspect {

    @Before("execution(public int com.atguigu.server.impl.CalcServiceImpl.*(..))")
    public void beforeNotify() {
        System.out.println("******** @Before我是前置通知MyAspect");
    }

    @After("execution(public int com.atguigu.server.impl.CalcServiceImpl.*(..))")
    public void afterNotify() {
        System.out.println("******** @After我是后置通知MyAspect");
    }

    @AfterReturning("execution(public int com.atguigu.server.impl.CalcServiceImpl.*(..))")
    public void afterReturningNotify() {
        System.out.println("******** @afterReturning我是返回后通知MyAspect");
    }

    @AfterThrowing("execution(public int com.atguigu.server.impl.CalcServiceImpl.*(..))")
    public void afterThrowingNotify() {
        System.out.println("******** @afterThrowing我是异常通知MyAspect");
    }

    @Around("execution(public int com.atguigu.server.impl.CalcServiceImpl.*(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object retValue = null;
        System.out.println("我是环绕通知之前AAA");
        retValue = proceedingJoinPoint.proceed();
        System.out.println("我是环绕通知之后BBB");
        return retValue;
    }
}
