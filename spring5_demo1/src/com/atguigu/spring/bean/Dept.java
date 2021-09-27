package com.atguigu.spring.bean;

/**
 * @author WangZY
 * @date 2021年09月16日15:49
 */
//部门类
public class Dept {

    private String dName;

    public void setdName(String dName) {
        this.dName = dName;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dName='" + dName + '\'' +
                '}';
    }
}
