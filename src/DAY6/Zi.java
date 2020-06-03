/*
 * Copyright (c) 2020 魏遇卿 All Rights Reserved.
 * FileName: Zi.java
 * @author: 魏遇卿@date: 2020/5/20 下午4:59@version: 1.0
 * E-mail:358614401@qq.com
 * Code with UTF-8
 */

package DAY6;

public class Zi extends Fu {
    public int age=21;
    public void show(){
//        System.out.println("method");
        int age=30;
        System.out.println(age);
        //访问成员变量和age
        System.out.println(this.age);
        //访问父类成员变量age
        System.out.println(super.age);
    }
}
