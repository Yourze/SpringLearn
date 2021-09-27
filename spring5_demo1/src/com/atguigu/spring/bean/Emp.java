package com.atguigu.spring.bean;

/**
 * @author WangZY
 * @date 2021年09月16日15:50
 */
//员工类
public class Emp {

    private String eName;
    private String gender;

    //员工属于某一个部门，使用对象形式表示
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public void add() {
        System.out.println(eName + "::" + gender + "::" + dept);
    }
}
