package com.xiangcm.spring5;

/**
 * @ClassName: Book
 * @Description: 演示spring注入属性
 * @Author: DELL
 * @Date: 2021/1/15 21:31
 **/
public class Book {
    // 创建属性
    private String bookName;
    private String bookAuthor;
    private String bookAddress;
    private String bookDate;
    // 创建属性对应的set方法
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
    public void setBookAddress(String bookAddress) {
        this.bookAddress = bookAddress;
    }
    public void setBookDate(String bookDate) {
        this.bookDate = bookDate;
    }

    /*/**
     * @Author xiangcm
     * @Description 测试方法
     * @Date 22:05 2021/1/15
     * @Param []
     * @return void
    **/
    public void testDemo() {
        System.out.println(bookName+":"+bookAuthor+":"+bookAddress);
    }
}
