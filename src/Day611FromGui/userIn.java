/*
 * Copyright (c) 2020 魏遇卿 All Rights Reserved.
 * FileName: usrIn.java
 * @author: 魏遇卿@date: 2020/6/11 下午4:53@version: 1.0
 * E-mail:358614401@qq.com
 * Code with UTF-8
 */

package Day611FromGui;


import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class userIn extends JFrame implements ActionListener {
    //设置组件
    private JButton
            //创建窗体
            login = new JButton("login");
    private JTextField
            //创建组件
            admin = new JTextField(),
            password = new JTextField();
            //创建容器
    private JPanel contentPanel=new JPanel();

    public userIn() {
        super("Auto score to exam");
        /* this.setBounds(100,100,100,100);*/
        //获取主容器并设置为网格组布局
        // contentPanel = this.getContentPane();
        contentPanel.setLayout(null);
        this.setVisible(true);
        this.setSize(500, 350);//设置窗口大小
        this.setResizable(false);//设置窗口固定大小
        this.setLocationRelativeTo(null);//设置窗口居中
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置默认关闭操作

        admin.setText("学号");
        password.setText("password");

        //添加组件
        contentPanel.setLayout(null);
        add(admin);
        add(password);
        add(login);

        //组件位置
        admin.setBounds(95,130,300,25);
        password.setBounds(95,154,300,25);
        login.setBounds(315,225,90,20);
        //显示组件
        admin.setOpaque(false);
        password.setOpaque(false);
        login.setOpaque(false);

        //设置监听（鼠标点击之后输入密码
        admin.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                int c = e.getButton();
                if(c == MouseEvent.BUTTON1 && admin.getText().equals("学号") &&e.getClickCount()==1) {
                    admin.setText(null);
                    /* password.setText("password");*/
                }
            }
        });
        admin.addCaretListener(new CaretListener(){
            @Override
            public void caretUpdate(CaretEvent e){

            }
        });
        password.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                int c = e.getButton();
                if(c == MouseEvent.BUTTON1 && password.getText().equals("password") &&e.getClickCount()==1) {
                    password.setText(null);
                    /* admin.setText("学号");*/
                }
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }


}
