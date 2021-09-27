package com.atguigu.spring.testdemo;

import com.atguigu.spring.bean.Emp;
import com.atguigu.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author WangZY
 * @date 2021年09月15日20:58
 */
public class TestBean {
    @Test
    public void testBean1() {
        //内部bean
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService",UserService.class);
        userService.add();
    }

    @Test
    public void testBean2() {
        //外部bean
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.add();
    }

    @Test
    public void testBean3() {
        //级联赋值
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.add();
    }


}
