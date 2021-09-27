package com.atguigu.spring.testdemo;

import com.atguigu.spring.Book;
import com.atguigu.spring.Orders;
import com.atguigu.spring.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author WangZY
 * @date 2021年09月15日16:40
 */
public class TestSpring {
    @Test
    public void testAdd() {
        //1.加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置文件创建的对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook1() {
        //1.加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置文件创建的对象
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.testDemo();
    }

    @Test
    public void testOrder() {
        //1.加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置文件创建的对象
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders);
        orders.testDemo();
    }
}
