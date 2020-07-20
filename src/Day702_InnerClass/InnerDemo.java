/*
 * Copyright (c) 2020 魏遇卿 All Rights Reserved.
 * FileName: InnerDemo.java
 * author: 魏遇卿
 * date: 2020/7/19 下午4:08
 * version: 1.0
 * E-mail:358614401@qq.com
 * Code with UTF-8
 * java version "14.0.1" 2020-04-14
 */

package Day702_InnerClass;
/*ceshilei
* */
public class InnerDemo {
    public static void main(String[] args) {
        //    创建内部类对象并调用方法
//    Outer.Inner i= Outer.Inner();
        //Outer.Inner i= new Outer.new Inner();
        Outer o=new Outer();
        o.method();
    }


}
