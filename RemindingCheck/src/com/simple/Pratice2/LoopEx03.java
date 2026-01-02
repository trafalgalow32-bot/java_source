package com.simple.Pratice2;

import java.util.Scanner;

public class LoopEx03 {

	public static void main(String[] args) {
		// 3. 사용자로부터 정수 N을 입력받아 1부터 N까지의 수 중 홀수만 출력하시오.
		// 단, 홀수의 개수도 함께 출력하시오.
		Scanner kbd = new Scanner(System.in);

		System.out.println("1부터 어디까지 입력할까요? (N입력) : ");
		int n = kbd.nextInt();

//		int odd = 0; 홀수 자체는 굳이 변수로 둘 필요가.....
		int count = 0; // 얘는 잘 했고

		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) { // 여기까지는 잘 했는디.... 어렵도다!
				System.out.print(i + " ");
				count++;
			}

		}
//		System.out.println("홀수: "+n);
		System.out.println("홀수의 개수: " + count + "개");
		
	}
}
