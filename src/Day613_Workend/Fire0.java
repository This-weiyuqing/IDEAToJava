/*
 * Copyright (c) 2020 魏遇卿 All Rights Reserved.
 * FileName: Fire0.java
 * @author: 魏遇卿@date: 2020/6/14 下午12:20@version: 1.0
 * E-mail:358614401@qq.com
 * Code with UTF-8
 * java version "14.0.1" 2020-04-14
 */

package Day613_Workend;

import java.io.File;

public class Fire0 {
    public static void main(String[] args) {
        File srcfile = new File("D:\\WindowsCToD\\fire\\GeneticsMultipleChoice\\Question");
        getAllFilePath(srcfile);
        System.out.println();
    }
public static void getAllFilePath(File srcfile){
        File[]fileArr = srcfile.listFiles();
    System.out.println();
    if (fileArr != null) {
        for (File file:fileArr){
            if (file.isDirectory()) {
                getAllFilePath(file);
            }else {
                System.out.println(file.getAbsolutePath());
            }
        }

    }
}
}

