package com.xiangcm.spring5.bean;

/**
 * @ClassName: Dept
 * @Description: 部门类
 * @Author: DELL
 * @Date: 2021/1/16 13:34
 **/
public class Dept {
    private String deptName;

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    /*  public String getDeptName() {
        return deptName;
    }*/

    @Override
    public String toString() {
        return "Dept{" +
                "deptName='" + deptName + '\'' +
                '}';
    }
}
