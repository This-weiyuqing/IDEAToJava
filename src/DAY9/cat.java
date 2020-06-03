/*
 * Copyright (c) 2020 魏遇卿 All Rights Reserved.
 * FileName: cat.java
 * @author: 魏遇卿@date: 2020/5/30 下午2:52@version: 1.0
 * E-mail:358614401@qq.com
 * Code with UTF-8
 */

package DAY9;

public class cat extends animal {
    public int age=20;
    public int weight=10;
    @Override
    public void eat() {
        System.out.println("cat eat fish");
    }
    public void playGame(){
        System.out.println("cat play game");
    }
}
