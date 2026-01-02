package com.simple.graphic;

import javax.swing.*;
import java.awt.*;

public class GraphicEx extends JFrame {
    JButton add;
    JTextField keyIn;
    JCheckBox checkBox;
    JLabel label;

    public GraphicEx(){
        setTitle("나의 첫 윈도우");
        setSize(300, 600);

        setLayout(new FlowLayout());
        add = new JButton("덧셈");
        label = new JLabel("국어점수 : ");
        keyIn = new JTextField("점수 입력하세요", 5);
        checkBox = new JCheckBox();

        add(checkBox);
        add(add);
        add(label);
        add(keyIn);

        setVisible(true);
    }

    public static void main(String[] args) {
        new GraphicEx();

    }
}
