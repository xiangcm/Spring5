package com.xiangcm.spring5.bean;

/**
 * @ClassName: Emp
 * @Description: 员工类
 * @Author: DELL
 * @Date: 2021/1/16 13:35
 **/
public class Emp {
    private String empName;
    private String empGender;
    // 员工属于某一个部门,使用对象形式表示
    private Dept dept;
    // 使用dept.deptName 级联赋值,必须要写get方法

    public Dept getDept() {
        return dept;
    }
    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public void setEmpGender(String empGender) {
        this.empGender = empGender;
    }

    public void add(){
        System.out.println(empName+"::"+empGender+"::"+dept);
    }
}
