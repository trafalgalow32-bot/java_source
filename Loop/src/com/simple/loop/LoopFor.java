package com.simple.loop;

public class LoopFor {

	public static void main(String[] args) {
		// for : 정해진 횟수 만큼 반복, 예시 10번 반복
		for (int i = 0; i < 10; i++) {
			//1,2,3,4,5~10
			System.out.println("i :" + i);
		}

		System.out.println();
		
			//1,3,5,7,9
		for (int i = 1; i <= 9; i+=2) {
			// i = i + 1; --> i++;
			// i = i + 2; --> i+=2; (복합 연산)
			System.out.println("i :" + i);
		}
		
		System.out.println();

		// 10,15,20,25, ~100
	for (int i = 10; i <= 100; i+=5) {
		// i = i + 1; --> i++;
		// i = i + 2; --> i+=2; (복합 연산)
		System.out.println("i :" + i);
	}
		System.out.println("프로그램 종료됨");
	}

}
