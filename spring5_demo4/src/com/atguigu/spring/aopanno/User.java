package com.atguigu.spring.aopanno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author WangZY
 * @date 2021年09月26日15:25
 */
@Component
public class User {
    public void add() {
        System.out.println("add......");
    }
}
