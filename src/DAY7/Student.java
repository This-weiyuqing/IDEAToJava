/*
 * Copyright (c) 2020 魏遇卿 All Rights Reserved.
 * FileName: Student.java
 * @author: 魏遇卿@date: 2020/5/16 下午12:58@version: 1.0
 * E-mail:358614401@qq.com
 * Code with UTF-8
 */

package DAY7;

public class Student {
    private String name;
    private int age;
   //局部变量
    public void setName(String name){
        //name=name;
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void show(){
        System.out.println(name+":"+age);
    }
}
