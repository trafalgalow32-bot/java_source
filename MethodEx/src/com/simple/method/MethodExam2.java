package com.simple.method;

import java.util.Scanner;

public class MethodExam2 {

	public static void main(String[] args) {
		// 메서드 : 입력 -> 처리 -> 출력
		
		// 사칙연산 계산기 만들기
		
		// 데이터 입력 : 정수 2개
		int num1=5;
		int num2=2;		
		
		int sum, sub, mul; // 나누기는 실수가 나와야 하므로 double로 처리
		double div;
		
		// 데이터 처리 : +,-,x,/
		sum = hap(num1,num2); // num1 + num2;
		
		sub = cha(); // num1 - num2; 입력은 외부에서 받기 
		kub(num1, num2); // num1 * num2; 입력은 정수 2개 출력은 자체 출력
		nanuki(); // num1 / (double)num2;
		
		
		// 데이터 출력 : 사칙연산 결과 출력
		System.out.println("num1 num2 합   차 곱    몫");
		System.out.printf("%4d %4d %2d %2d %2d %6.2f \n",
				num1, num2,
				sum,sub,100,12.3);
		System.out.println(" 프로그램 종료");
		}
	
	private static void nanuki() {
		// 
//		Scanner kbd = new Scanner(System.in);
//		System.out.println("정수 입력 2개 : 10 20");
		int num1 = keyIn();
		int num2 = keyIn();
		
		double div = (double)num1 / num2;
		System.out.println(" 나눗셈 결과 : "+div);
	}

	private static void kub(int num1, int num2) {
		// 정수 2개를 받아서 곱한 결과를 자체 출력
		
		System.out.println(" 곱한 결과 : "+num1*num2);
		
	}

	private static int cha() {
		// num1, num2를 키보드로 입력받아서
		// 차를 구한다.
//		Scanner kbd = new Scanner(System.in);
//		System.out.println("정수 입력 2개 : 10 20");
		int num1 = keyIn();
		int num2 = keyIn();
				
		return num1-num2;
	}

	/*
	 * 입력 : 정수 2개
	 * 처리 : 정수 덧셈
	 * 반환값 : 처리 결과 정수값
	 * 작성자 : @author simple
	 * 작성일자 : @since 2025년 12월 22일
	 */

	private static int hap(int n1, int n2) {
		// 정수 2개를 더해서 그 결과를 반환
		int sum = n1 + n2;
		
		return sum;
	}
	
	private static int keyIn() {
		Scanner kbd = new Scanner(System.in);
		System.out.println("정수 입력 :");
		int num1 = kbd.nextInt();
		return num1;
		
	}

}
