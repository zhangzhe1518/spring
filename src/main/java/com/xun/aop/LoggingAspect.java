package com.xun.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author zhangzhe
 * 声明一个切面类
 */
@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void com.xun.aop.HelloWorld.sayhello(String))")
    public void beforeMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("在"+methodName+"方法执行前开始执行，参数为："+args);
    }
}
