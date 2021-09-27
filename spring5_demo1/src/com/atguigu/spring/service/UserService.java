package com.atguigu.spring.service;

import com.atguigu.spring.dao.UserDao;
import com.atguigu.spring.dao.UserDaoImpl;

/**
 * @author WangZY
 * @date 2021年09月15日20:47
 */
public class UserService {
    //创建UserDao类型的属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("service add........");
        userDao.update();
    }
}
