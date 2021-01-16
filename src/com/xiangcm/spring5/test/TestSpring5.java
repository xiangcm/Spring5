package com.xiangcm.spring5.test;

import com.sun.org.apache.xpath.internal.operations.Or;
import com.xiangcm.spring5.Book;
import com.xiangcm.spring5.Orders;
import com.xiangcm.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: TestSpring5
 * @Description: TODO
 * @Author: DELL
 * @Date: 2021/1/12 22:38
 * @Description: TODO
 **/
public class TestSpring5 {
    @Test
    public void testAdd(){
        // 1、加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        // 2、获取配置文件创建的对象
        User user = context.getBean("user", User.class);
        user.add();
    }
    @Test
    public void testBook(){
        // 1 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        // 2 获取配置文件创建的对象
        Book book = context.getBean("book",Book.class);
        // 3 调用对象的方法
        System.out.println(book);
        book.testDemo();
    }

    @Test
    public void testOrders(){
        // 1 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        // 2 获取配置文件创建的对象
        Orders orders = context.getBean("orders", Orders.class);
        // 3 调用对象的方法
        System.out.println(orders);
        orders.testDemo();
    }
}
