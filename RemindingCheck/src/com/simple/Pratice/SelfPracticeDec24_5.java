package com.simple.Pratice;

import java.util.Scanner;

public class SelfPracticeDec24_5 {

	public static void main(String[] args) {
//		5. 최댓값 구하기 (두 수)
//		두 정수를 입력받아 더 큰 수를 출력하세요.
		System.out.println("두 정수를 입력받아 더 큰 수를 출력하세요.");
		
		Scanner kbd = new Scanner(System.in);
		int a = kbd.nextInt();
		int b = kbd.nextInt();
		
		// 내가 쓴 답안
//		int max = 0;
//		
//		if (a > b) {
//			max = a;
//		} else {
//			max = b;
//		}
//		System.out.println("더 큰 수 : "+max);
		
		// 모범 답안
        System.out.println((a > b) ? a : b);
		kbd.close();
		}	
	}
