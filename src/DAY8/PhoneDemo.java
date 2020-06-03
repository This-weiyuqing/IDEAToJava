/*
 * Copyright (c) 2020 魏遇卿 All Rights Reserved.
 * FileName: PhoneDemo.java
 * @author: 魏遇卿@date: 2020/5/21 下午6:36@version: 1.0
 * E-mail:358614401@qq.com
 * Code with UTF-8
 */

package DAY8;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.call("people one");
        System.out.println("-----------");
        NewPhone np=new NewPhone();
        np.call("people one");
    }
}
