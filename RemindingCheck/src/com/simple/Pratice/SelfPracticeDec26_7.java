package com.simple.Pratice;

import java.util.Scanner;

public class SelfPracticeDec26_7 {

	public static void main(String[] args) {
//	7. 요일 출력하기
//		1~7 사이의 숫자를 입력받아 1은 월요일, 2는 화요일 … 7은 일요일을 출력하세요.
		
		System.out.println("1~7사이의 숫자를 입력 후 요일을 출력하시오.");
		
		Scanner kbd = new Scanner(System.in);
		
		int num = kbd.nextInt();

//		 switch 활용(반복x)
		switch (num) {
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");			
			break;
		case 3:
			System.out.println("수요일");			
			break;
		case 4:
			System.out.println("목요일");			
			break;
		case 5:
			System.out.println("금요일");			
			break;
		case 6:
			System.out.println("토요일");			
			break;
		case 7:
			System.out.println("일요일");			
			break;
		default:
			System.out.println("1~7사이의 숫자를 입력해주세요.");
			
//		// do while 활용 (반복o) - 이건 좀 나중에 합시다... 생각보다 시간이 많이 걸릴듯... 기초가 없으니 응용 자체가 어려운...
//		int day;
//		do {
//			
			
		}
		kbd.close();
		}
}
		
