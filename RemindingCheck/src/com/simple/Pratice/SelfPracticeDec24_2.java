package com.simple.Pratice;

import java.util.Scanner;

public class SelfPracticeDec24_2 {

	public static void main(String[] args) {
//		2. 양수/음수/0 판별하기
//		정수를 입력받아 양수, 음수, 0 중 어떤 값인지 출력하세요.	
		
		System.out.println("임의의 정수를 입력받아 양수, 음수, 0을 판별하시오.");
		Scanner kbd = new Scanner(System.in);
		int num = kbd.nextInt();
		String result;
		
		// 내가 쓴 답
//		if (num > 0) {
//			result = "양수";
//		} else if (num < 0) {
//			result = "음수";
//		} else {
//			result = "0";}
//		System.out.println("판별 결과 : "+result);				
		
		//모범 답안
		if (num > 0 ) {
			System.out.println("양수");
		} else if (num < 0) {
			System.out.println("음수");
		} else {
			System.out.println("0");
		}
		kbd.close();
	}
}
