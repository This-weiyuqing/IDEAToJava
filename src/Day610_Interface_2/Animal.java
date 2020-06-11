/*
 * Copyright (c) 2020 魏遇卿 All Rights Reserved.
 * FileName: Animal.java
 * @author: 魏遇卿@date: 2020/6/10 下午4:47@version: 1.0
 * E-mail:358614401@qq.com
 * Code with UTF-8
 */

package Day610_Interface_2;


public abstract class Animal {
    private String name;
    private  int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public abstract void eat();
}
