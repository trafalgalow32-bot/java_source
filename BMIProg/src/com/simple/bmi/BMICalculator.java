package com.simple.bmi;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMICalculator extends JFrame {
    private JTextField tfHeight;
    private JTextField tfWeight;
    private JTextArea taResult;

    private void calculateBMI() {
       try {
           int height = Integer.parseInt(tfHeight.getText());
           int weight = Integer.parseInt(tfWeight.getText());
           // BMI 지수 공식 : 몸무게 / 키의 제곱(단위)
           double height_ = (double) height / 100;
           double bmi = weight / (height_ * height_);
           String bmi_="";
           if(bmi > 25) {
               bmi_ = "과체중";
           } else if (bmi > 23) {
               bmi_ = "정상";
           } else {
               bmi_ = "저체중";
           }

           taResult.append(height+"cm "+weight+"kg "+"BMI 지수 : " + bmi+"\n");
           taResult.append("평가표 : "+bmi_+"\n");

       } catch (NumberFormatException e) {
           JOptionPane.showMessageDialog(this, "숫자를 정확히 입력하세요.");
       } catch(IllegalArgumentException e) {
           JOptionPane.showMessageDialog(this,e.getMessage());
       }
    }

    public BMICalculator() throws HeadlessException {
        setTitle("BMI: 비만도 측정");
        setSize(350, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 입력패널
        JPanel inputPanel = new JPanel(new GridLayout(2,2));

        // 객체 생성
        JLabel lbl1 = new JLabel(" 키 :");
        tfHeight = new JTextField(5);

        JLabel lbl2 = new JLabel(" 몸무게 : ");
        tfWeight = new JTextField(5);
        taResult = new JTextArea(5, 10);

        JButton button = new JButton("BMI 계산");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateBMI();
            }
        });

        button.addActionListener(e->calculateBMI());

        // 판넬에 등록
        inputPanel.add(lbl1);
        inputPanel.add(tfHeight);
        inputPanel.add(lbl2);
        inputPanel.add(tfWeight);


        // 객체 등록(배치)
        add(inputPanel,BorderLayout.NORTH);
        add(button,BorderLayout.SOUTH);
        add(taResult,BorderLayout.CENTER);

        // 윈도우 보이기
        setVisible(true);
    }



    public static void main(String[] args) {
        new BMICalculator();
    }


}
