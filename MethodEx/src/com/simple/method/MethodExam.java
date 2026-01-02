package com.simple.method;

public class MethodExam {

	public static void main(String[] args) {
		// 메서드 : 입력 -> 처리 -> 출력
		
		// 사칙연산 계산기 만들기
		
		// 데이터 입력 : 정수 2개
		int num1=5;
		int num2=2;		
		
		int sum, sub, mul; // 나누기는 실수가 나와야 하므로 double로 처리
		double div;
		
		// 데이터 처리 : +,-,x,/
		sum = num1 + num2;
		sub = num1 - num2;
		mul = num1 * num2;
		div = num1 / (double)num2;
		
		
		// 데이터 출력 : 사칙연산 결과 출력
		System.out.println("num1 num2 합   차 곱    몫");
		System.out.printf("%4d %4d %2d %2d %2d %6.2f \n",
				num1, num2,
				sum,sub,mul,div);
		}

}
