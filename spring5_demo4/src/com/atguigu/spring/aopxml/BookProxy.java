package com.atguigu.spring.aopxml;

import org.aspectj.lang.annotation.Before;

/**
 * @author WangZY
 * @date 2021年09月26日16:05
 */
public class BookProxy {
    public void before() {
        System.out.println("before......");
    }
}
