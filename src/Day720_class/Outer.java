/*
 * Copyright (c) 2020 魏遇卿 All Rights Reserved.
 * FileName: Outer.java
 * author: 魏遇卿
 * date: 2020/7/20 下午6:56
 * version: 1.0
 * E-mail:358614401@qq.com
 * Code with UTF-8
 * java version "14.0.1" 2020-04-14
 */

package Day720_class;

public class Outer {
    private int num =10;
    public void method(){
        class Inner{
            public void show(){
                System.out.println(num);
            }
        }
        Inner i=new Inner();
        i.show();
    }
}
