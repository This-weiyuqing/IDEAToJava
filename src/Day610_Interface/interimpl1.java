/*
 * Copyright (c) 2020 魏遇卿 All Rights Reserved.
 * FileName: interimpl1.java
 * @author: 魏遇卿@date: 2020/6/10 下午4:18@version: 1.0
 * E-mail:358614401@qq.com
 * Code with UTF-8
 */

package Day610_Interface;

//public class interimpl1 implements inter{
public class interimpl1 extends Object implements inter{

        public interimpl1() {
            super();
        }

        @Override
        public void methood() {
            System.out.println("method");
        }
        @Override
        public void show() {
            System.out.println("show");
        }
}
