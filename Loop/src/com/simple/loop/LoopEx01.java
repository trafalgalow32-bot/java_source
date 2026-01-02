package com.simple.loop;

public class LoopEx01 {

	public static void main(String[] args) {
		// 1~10까지 짝수의 합을 구하시오.
		// 1~10까지 홀수의 합을 구하시오.

		// for
		// 짝수합
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) { // 짝수 조건
				evenSum += i;
				System.out.print(i + ", ");
			} else {
				oddSum += i;
				System.out.print(i + ", ");
			} // else 써서 해도 됨! 아니, 오히려 else 써야...

			// 홀수합
//		for (int i = 1; i <= 10; i++) {
//			if (i % 2 != 0) { // 홀수 조건
//			}
//		}
			// System.out.println(); \n 대신 이렇게 써줘도 줄바꿈 처리 가능!!
			System.out.println("\n짝수 합: " + evenSum);
			System.out.println("\n홀수 합: " + oddSum);

		}
	}
}
