package com.atguigu.spring.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author WangZY
 * @date 2021年09月26日15:26
 */
//增强类
@Component
@Aspect //生成代理对象
@Order(3)
public class UserProxy {

    //相同切入点抽取
    @Pointcut(value = "execution(* com.atguigu.spring.aopanno.User.add(..))")
    public void pointDemo() {}

    //前置通知
    @Before(value = "execution(* com.atguigu.spring.aopanno.User.add(..))")
    public void before() {
        System.out.println("before...... ");
    }
    //后置通知
    @AfterReturning(value = "execution(* com.atguigu.spring.aopanno.User.add(..))")
    public void afterReturning() {
        System.out.println("afterReturning......");
    }
    //最终通知
    @After(value = "execution(* com.atguigu.spring.aopanno.User.add(..))")
    public void after() {
        System.out.println("after......");
    }
    //异常通知
    @AfterThrowing(value = "execution(* com.atguigu.spring.aopanno.User.add(..))")
    public void afterThrowing() {
        System.out.println("afterThrowing......");
    }
    //环绕通知
//    @Around(value = "execution(* com.atguigu.spring.aopanno.User.add(..))")
//    public void arround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
//        System.out.println("环绕之前......");
//        proceedingJoinPoint.proceed();
//        System.out.println("环绕之后......");
//    }
}
