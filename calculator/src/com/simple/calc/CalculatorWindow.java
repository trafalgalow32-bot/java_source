package com.simple.calc;

import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class CalculatorWindow extends JFrame implements ActionListener{
    private JTextField tf1, tf2, tfOut;
    private JLabel lbl1, lbl2, lbl3;
    private JButton btnAdd, btnSub, btnMul, btnDiv;

    public JTextField getTf1() {
        return tf1;
    }
    public JTextField getTf2() {
        return tf2;
    }
    public JTextField getTfOut() {
        return tfOut;
    }

    public CalculatorWindow throws HeadlessException {
        // 윈도우 설정
        setTitle("OOP 계산기");
        setSize(100, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setResizable(false);

        //객체 생성
        tf1 = new JTextField(5);
        tf2 = new JTextField(5);
        tfOut = new JTextField(10);

        lbl1 = new JLabel("숫자1: ");
        lbl2 = new JLabel("숫자2: ");
        lbl3 = new JLabel("연산결과: ");

        btnAdd = new JButton("덧셈");
        btnSub = new JButton("뺄셈");
        btnMul = new JButton("곱셈");
        btnDiv = new JButton("나눗셈");

        // 버튼 이벤트 처리 --> 버튼 이벤트 등록
        // 독립 클래스로 구현

        btnAdd.addActionListener(new AddActionListener(this));

        btnSub.addActionListener(this);

        //
        btnDiv.addActionListener(e->execute(new DivCaculator()));

        //
        btnMul.addActionListener(e->execute(new MulCaculator()));

        // 객체 등록
        add(lbl1);
        add(tf1);
        add(lbl2);
        add(tf2);
        add(btnAdd);
        add(btnSub);
        add(btnMul);
        add(btnDiv);
        add(lbl3);
        add(tfOut);

        setVisible(true);
    }

    // 공통기능 메서드
    public void execute(Calculator calculator) {
        // 화면에 입력한 숫자를 변수화
        double a = Double.parseDouble(tf1.getText());
        double b = Double.parseDouble(tf2.getText());
        double result = calculator.calculate(a,b);
        tfOut.setText(" "+result);
    }

    public static void main(String[] args) {
        new CalculatorWindow();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 화면에 입력한 숫자를 변수화
        double a = Double.parseDouble(tf1.getText());
        double b = Double.parseDouble(tf2.getText());
        double result = a-b;
        tfOut.setText(" "+result);
    }
}