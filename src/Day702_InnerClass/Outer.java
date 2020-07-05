/*
 * Copyright (c) 2020 魏遇卿 All Rights Reserved.
 * FileName: Outer.java
 * author: 魏遇卿
 * date: 2020/7/3 下午4:43
 * version: 1.0
 * E-mail:358614401@qq.com
 * Code with UTF-8
 * java version "14.0.1" 2020-04-14
 */

package Day702_InnerClass;

public class Outer {
    private int num=10;
    public class Inner{
        public void show(){
            System.out.println(num);
        }
    }
    public void  method(){
        //show();
        Inner i=new Inner();
        i.show();
    }
}
