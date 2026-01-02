package com.simple.Pratice2;

public class LoopEx01 {

	public static void main(String[] args) {
		// Q1. 1부터 100까지 숫자 중 3의 배수와 5의 배수를 모두 출력하시오.
		// (단, 3과 5의 공배수는 "FizzBuzz"라고 출력하시오.)

		// 3의 배수와 5의 배수를 모두 출력
//		for (int i=1; i <= 100; i++) {
//		if(i % 3 == 0 || i % 5 ==0) {
//			System.out.println(i + " ");
//			}
//		}
		// 3과 5의 공배수를 FizzBuzz로 출력, ??: 모두 출력한 리스트에 FizzBuzz 문구를 넣어야 하는지, 아니면 모두 출력한 후,
		// 별도로 공배수를 나열하고 문구를 넣어도 되는지?
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0 || i % 5 == 0) {
				System.out.println(i);
			}

		}
	}
}