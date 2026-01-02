package com.simple.Pratice2;

import java.util.Scanner;

public class LoopEx02 {

	public static void main(String[] args) {
		// 2. 사용자로부터 정수 N을 입력받아 1부터 N까지의 합을 출력하시오.
		// 단, 합이 50을 초과하면 반복을 중단하고 현재까지의 합을 출력하시오.
		Scanner kbd = new Scanner(System.in);

		System.out.println("1부터 어디까지 더할까요? (N입력) : ");
		int n = kbd.nextInt();

		int sum = 0;
		int last = 0;

		for (int i = 1; i <= n; i++) {
			sum += i;
			last = i;

			if (sum > 50) {
				System.out.println("합이 50을 초과하였으므로 계산을 종료합니다.");
				break;
			}

		}
		System.out.println("마지막으로 더한 숫자: "+last);
		System.out.println("최종 합계: " + sum);
		
	}
}
