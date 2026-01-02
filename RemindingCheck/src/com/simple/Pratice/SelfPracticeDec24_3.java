package com.simple.Pratice;

import java.util.Scanner;

public class SelfPracticeDec24_3 {

	public static void main(String[] args) {
//		3. 나이 판별하기
//		나이를 입력받아 성인(20세 이상)인지 미성년자인지 출력하세요.

		System.out.println("나이를 입력받아 성인인지, 미성년자인지 출력하시오.");
		Scanner kbd = new Scanner(System.in);
		int age;
		age = kbd.nextInt();
		
		if(age >= 20) {
			System.out.println("성인");
		} else {
			System.out.println("미성년자");
		}
		kbd.close();
				
	}
}
