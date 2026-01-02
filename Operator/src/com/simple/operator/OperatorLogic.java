package com.simple.operator;

public class OperatorLogic {

	public static void main(String[] args) {
		
		// 관계 연산자
		// 실습문제. 어떤 사람이 성년인지 아닌지 판별
		// 성년은 나이가 20세
		// 020625-4403619 : 2002 -> 2025-2002 => 23
				
		// 1. 태어난 해를 입력받는다.
		int age; // 준비(선언)
		int birthYear = 2006; // 초기화
		boolean fullAge;
				
		final int AGE20 = 20;
		final int YEAR = 2025; // 상수값
					
		// 2. 나이 구하기
		age = YEAR - birthYear;
		
		// 3. 성년여부 비교 판단
		fullAge = age >= AGE20;
		
		System.out.println("나이 :"+age);
		System.out.println("성년인가? "+fullAge);
		
	}

}
