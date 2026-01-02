package com.simple.Pratice2;

import java.util.Scanner;

public class LoopEx04 {

	public static void main(String[] args) {
//		4. 구구단 전체(2단~9단)를 출력하시오.
//		아래 그림을 참조하여 2,3,4,5단을 먼저 출력하도록 프로그램을 작성해보세요.
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
