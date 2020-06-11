/*
 * Copyright (c) 2020 魏遇卿 All Rights Reserved.
 * FileName: cat.java
 * @author: 魏遇卿@date: 2020/6/10 下午4:52@version: 1.0
 * E-mail:358614401@qq.com
 * Code with UTF-8
 */

package Day610_Interface_2;

public class Cat extends Animal implements Jumpping{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
            System.out.println(" cat eat");
        }

    @Override
    public void jump() {
        System.out.println("cat jump");
    }
}
