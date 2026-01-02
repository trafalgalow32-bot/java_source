package com.simple.Pratice;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BMICalculatorDec30 extends JFrame{
	private JTextField heightField, weightField;
	private JLabel resultLabel;
	
	public BMICalculatorDec30() {
		setTitle("BMI 계산기");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(4, 2, 5, 5));
		
		// 입력 필드
		add(new JLabel("키 (cm):"));
		heightField = new JTextField();
		add(heightField);
		
		add(new JLabel("몸무게 (kg):"));
		weightField = new JTextField();
		add(weightField);
		
		// 버튼
		JButton calcButton = new JButton("BMI 계산");
		add(calcButton);
		
		// 결과 라벨
		resultLabel = new JLabel("결과가 여기에 표시됩니다.");
		add(resultLabel);
		
		// 버튼 이벤트 처리
		calcButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calculateBMI();
				
			}
		});
		
		setVisible(true);
	}
	
	private void calculateBMI() {
		try {
			double height = Double.parseDouble(heightField.getText()) / 100.0;
			double weight = Double.parseDouble(weightField.getText());
			
			double bmi = weight / (height * height);
			
			String evaluation;
			if (bmi < 18.5) {
				evaluation = "저체중";
			} else if (bmi < 23) {
				evaluation = "정상";
			} else if (bmi < 25) {
				evaluation = "과체중";
			} else {
				evaluation = "비만";
			}
			
			resultLabel.setText(String.format("BMI: %.2f (%s)", bmi, evaluation));
		} catch (NumberFormatException ex) {
			resultLabel.setText("숫자를 올바르게 입력하세요.");
		}
	}

	public static void main(String[] args) {
		new BMICalculatorDec30();

	}

}
