/*
 * Copyright (c) 2020 魏遇卿 All Rights Reserved.
 * FileName: animalDemo.java
 * @author: 魏遇卿@date: 2020/5/30 下午2:52@version: 1.0
 * E-mail:358614401@qq.com
 * Code with UTF-8
 */

package DAY9;

public class animalDemo {
    public static void main(String[] args) {
        //父类引用指向子类对象
        animal a = new cat();
        System.out.println(a.age);

        //父类没有会报错
        //System.out.println(a.weight);
    }
}
