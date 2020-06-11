/*
 * Copyright (c) 2020 魏遇卿 All Rights Reserved.
 * FileName: SwingUse.java
 * @author: 魏遇卿@date: 2020/6/3 下午3:54@version: 1.0
 * E-mail:358614401@qq.com
 * Code with UTF-8
 */
package Alone;
import java.awt.*;
import javax.swing.*;

import javax.swing.*;

public class SwingUse extends JFrame {
    public void CreateJFrame(String title){
        JFrame jf = new JFrame(title);
        Container container = jf.getContentPane();  //获取容器
        JLabel jl = new JLabel("jfaasdfrme标签");
        jl.setHorizontalAlignment(SwingConstants.CENTER);

        container.add(jl);
        container.setBackground(Color.GRAY);
        jf.setVisible(true);
        jf.setSize(200,150);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SwingUse().CreateJFrame("创建窗体");
    }
}
