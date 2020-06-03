/*
 * Copyright (c) 2020 魏遇卿 All Rights Reserved.
 * FileName: Student.java
 * @author: 魏遇卿@date: 2020/5/16 上午9:17@version: 1.0
 * E-mail:358614401@qq.com
 * Code with UTF-8
 */

package DAY5;

public class Student {
    String name;
    //int age;
    private int age;
    //提供get和set方法
    public void setAge(int a){
        //age=a;
        if (a < 0||a>120) {
            System.out.printf("年龄超出值域");
        }
    }
    public int getAge(){
        return age;
    }
    public void show(){
        System.out.printf(name+":"+age);
    }
}