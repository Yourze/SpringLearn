package com.atguigu.spring;

/**
 * @author WangZY
 * @date 2021年09月15日19:52
 */
//演示使用set方法注入属性
public class Book {
    //创建属性
    private String bName;
    private String bAuthor;
    private String address;

    //创建属性对应的set方法
    public void setbName(String bName) {
        this.bName = bName;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void testDemo() {
        System.out.println(bName + "::" + bAuthor + "::" + address);
    }

}
