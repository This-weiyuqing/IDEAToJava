/*
 * Copyright (c) 2020 魏遇卿 All Rights Reserved.
 * FileName: interfaceDemo.java
 * @author: 魏遇卿@date: 2020/6/10 下午4:17@version: 1.0
 * E-mail:358614401@qq.com
 * Code with UTF-8
 */

package Day610_Interface;

public class interfaceDemo {
    public static void main(String[] args) {
        inter i = new interimpl1();
        //i.num=20;
        System.out.println(i.num);
        //i.num2=40;
        System.out.println(i.num2);
        System.out.println(inter.num);
    }

}
