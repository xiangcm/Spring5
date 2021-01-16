package com.xiangcm.spring5;

import com.sun.org.apache.xpath.internal.objects.XString;

/**
 * @ClassName: Order
 * @Description: 演示spring注入属性
 * @Author: DELL
 * @Date: 2021/1/15 21:31
 **/
public class Orders {
    // 创建属性
    private String ordersName;
    private String ordersAddress;
    // 创建有参构造函数
    public Orders(String ordersName, String ordersAddress){
        this.ordersName = ordersName;
        this.ordersAddress = ordersAddress;
    }
    /*/**
     * @Author xiangcm
     * @Description 测试方法
     * @Date 22:05 2021/1/15
     * @Param []
     * @return void
    **/
    public void testDemo() {
        System.out.println(ordersName+":"+ordersAddress);
    }
}
