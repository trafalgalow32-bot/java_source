package com.simple.loop;

import java.util.Scanner;

public class LoopDoWhile {

	public static void main(String[] args) {
		// 키보드로 점수를 입력받아서 총점과 평균을 구한다.
		// 입력받은 점수의 숫자를 카운트 하여 평균을 구한다.
		int quit = 0;
		int jumsu = 0;
		int tot = 0; // 총점
		double avg; // 평균
		int count = 0; // 카운트 초기화

		Scanner kbd = new Scanner(System.in);
		count++;

		do {

			do {

				System.out.print("점수 입력(0~100) : ");
				jumsu = kbd.nextInt(); // 점수입력

			} while (jumsu < 0 || jumsu > 100);
			
			// 총점, 카운트
			// tot = tot + jumsu;을 아래와 같이 표현
			tot += jumsu; 
			count++; // 점수 카운트
			
			
			System.out.println("점수"+count+":"+jumsu);
			System.out.print("프로그램 종료 99: ");
			quit = kbd.nextInt(); // 점수입력

		} while (quit != 99);
		
		// 평균 구하기
		avg = (double) tot / count;
		
		System.out.println("총점:"+tot);
		System.out.printf("평균: %.2f \n",avg); //+가 아닌 ","(콤마) 
		
		System.out.print("프로그램 종료");
	}
}
