package com.simple.Pratice;

import java.util.Scanner;

public class SelfPracticeDec19 {

	public static void main(String[] args) {
		// 1부터 N까지의 수 중 소수 판별하기
		// 사용자로부터 정수 N을 입력받아
		// 1부터 N까지의 수 중 소수만 출력하시오.

		Scanner kbd = new Scanner(System.in);
		System.out.print("어디까지의 소수를 구할까요? (숫자 입력) : ");
		int num = kbd.nextInt();
		
		System.out.println("1부터 " + num + " 사이의 소수 목록: ");

		for (int i = 2; i <= num; i++) {
			boolean isPrime = true;

			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				System.out.println(i + " ");
			}
		}
	}
}
