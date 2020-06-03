/*
 * Copyright (c) 2020 魏遇卿 All Rights Reserved.
 * FileName: NewPhone.java
 * @author: 魏遇卿@date: 2020/5/21 下午6:44@version: 1.0
 * E-mail:358614401@qq.com
 * Code with UTF-8
 */

package DAY8;

public class NewPhone extends Phone{
    @Override
    public void call(String name){
        System.out.println("open video");
        //System.out.println("call"+name);
        super.call(name);
        //调用父类打电话功能
    }
}
