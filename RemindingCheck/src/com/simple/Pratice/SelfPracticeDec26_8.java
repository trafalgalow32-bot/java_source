package com.simple.Pratice;

import java.util.Scanner;

public class SelfPracticeDec26_8 {

	public static void main(String[] args) {
//	짝수인지 3의 배수인지 판별하기
// 정수를 입력받아 짝수인지, 3의 배수인지, 둘 다인지, 아무것도 아닌지 출력하세요.
		
		System.out.println("임의의 정수를 입력하시오.");
		
		Scanner kbd = new Scanner(System.in);
		
		int num = kbd.nextInt();
		// 내가 쓴 답: 이럴 경우 텍스트가 세 줄로 연달아 발생함...
//		if (num % 2 == 0) {
//			System.out.println("짝수");
//		} if (num % 3 == 0) {
//			System.out.println("3의 배수");
//		} if (num % 2 == 0 && num % 3 == 0) {
//			System.out.println("둘 다 해당");
//		} else {
//			System.out.println("둘 다 미해당");} 
		
		// 모범답안
		if(num % 2 == 0 && num % 3 == 0) {
			System.out.println("짝수이면서 3의 배수");
		} else if(num % 2 == 0) {
			System.out.println("짝수");
		} else if(num % 3 == 0) {
			System.out.println("3의 배수");
		} else {
			System.out.println("둘 다 미해당");
		}
		kbd.close();
		}
}
		
