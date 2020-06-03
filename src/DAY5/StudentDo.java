/*
 * Copyright (c) 2020 魏遇卿 All Rights Reserved.
 * FileName: StudentDo.java
 * @author: 魏遇卿@date: 2020/5/16 上午9:18@version: 1.0
 * E-mail:358614401@qq.com
 * Code with UTF-8
 */

package DAY5;

public class StudentDo {
    public static void main(String[] args) {
        Student s = new Student();
        s.name="撒旦法";
        //s.age=20;
        //s.age=-30;
        s.setAge(-30);
        s.show();
    }
}

