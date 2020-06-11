/*
 * Copyright (c) 2020 魏遇卿 All Rights Reserved.
 * FileName: AnimalDemo.java
 * @author: 魏遇卿@date: 2020/6/10 下午4:58@version: 1.0
 * E-mail:358614401@qq.com
 * Code with UTF-8
 */

package Day610_Interface_2;

public class AnimalDemo {
    public static void main(String[] args) {
        //创建对象 调用方法
        Jumpping j = new Cat();
        j.jump();
        System.out.println();

        Animal a = new Cat();
        a.setName("cata");
        a.setAge(5);
        System.out.println(a.getName() + " " + a.getAge());
        a.eat();
        //a.jump();
        System.out.println();

        a = new Cat("jiafei", 5);
        System.out.println(a.getName() + " " + a.getAge());
        a.eat();
        System.out.println();

        Cat c=new Cat();
        c.setName("jaifei");
        c.setAge(5);
        System.out.println(c.getName()+" "+c.getAge());
        c.eat();
        c.jump();
    }
}
