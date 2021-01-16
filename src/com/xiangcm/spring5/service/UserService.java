package com.xiangcm.spring5.service;

import com.xiangcm.spring5.dao.UserDao;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @Author: DELL
 * @Date: 2021/1/16 13:11
 **/
public class UserService {
    // 创建UserDao类型属性,生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void add(){
        System.out.println("UserService add......");
        userDao.update();
    }
}
