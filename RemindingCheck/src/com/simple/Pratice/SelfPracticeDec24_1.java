package com.simple.Pratice;

import java.util.Scanner;

public class SelfPracticeDec24_1 {

	public static void main(String[] args) {
//		1. 짝수/홀수 판별하기
//		사용자로부터 정수를 입력받아 짝수인지 홀수인지 출력하세요.
		
		System.out.println("임의 정수를 입력하세요.");
		Scanner kbd = new Scanner(System.in);
		// kbd.nextInt 이걸 좀 알아야....
		int num = kbd.nextInt();
		String result;
		if (num % 2==0) {
			result = "짝수";
		} else {
			result = "홀수";
		}
		System.out.println("판별 결과 :"+result);				
		
		kbd.close();
	}
}
