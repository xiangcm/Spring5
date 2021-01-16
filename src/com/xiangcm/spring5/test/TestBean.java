package com.xiangcm.spring5.test;

import com.xiangcm.spring5.bean.Emp;
import com.xiangcm.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: TestBean
 * @Description: TODO
 * @Author: DELL
 * @Date: 2021/1/16 13:17
 **/
public class TestBean {
    @Test
    public void testAdd(){;
        // 1 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        // 2 获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test
    public void testEmp(){;
        // 1 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        // 2 获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);
        emp.add();
    }

    @Test
    public void testEmp2(){;
        // 1 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        // 2 获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);
        emp.add();
    }

}
