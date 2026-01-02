package com.simple.loop;

public class LoopGugudan {

	public static void main(String[] args) {
		// 구구단

		// for
		// 구구단의 단
		for (int i = 1; i <= 9; i++) {
			System.out.printf("----- %d 단 ----- \n",i);
			// System.out.println(2+"x"+i+"="+(2*i));
			
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d x %2d = %2d \n", i, j, (i * j));
			}
			System.out.println();
		}
	}
}
