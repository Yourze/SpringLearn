package com.atguigu.spring.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author WangZY
 * @date 2021年09月26日15:58
 */
@Component
@Aspect
@Order(1)
public class PersonProxy {
    @Before(value = "execution(* com.atguigu.spring.aopanno.User.add(..))")
    public void before() {
        System.out.println("Person Before......");
    }
}
