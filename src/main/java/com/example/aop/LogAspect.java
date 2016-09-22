package com.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by wuyaoyao on 16/9/22.
 */
@Aspect
@Component
public class LogAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogAspect.class);

    @Pointcut("execution(public * com.example..*.*(..))")
    public void LogAspect(){}

    @Before("LogAspect()")
    public void logBefore(JoinPoint joinPoint) {
        LOGGER.info("类 " + joinPoint.getTarget().getClass().getName() + " 中的方法 " + joinPoint.getSignature().getName()
        + " 开始执行");
    }

    @After("LogAspect()")
    public void logAfter(JoinPoint joinPoint) {
        LOGGER.info("类 " + joinPoint.getTarget().getClass().getName() + " 中的方法 " + joinPoint.getSignature().getName()
                + " 执行结束");
    }

}
