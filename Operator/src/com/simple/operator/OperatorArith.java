package com.simple.operator;

public class OperatorArith {

	public static void main(String[] args) {
		// 산술연산자
		// 어떤숫자가 짝수인지 홀수인지 처리
		int num = 542;
		
		//int even = num % 2;
		boolean even = 0 == (num % 2);
		
		System.out.println("Is it even number? :"+even);

		// 실습문제. 어떤 숫자가 3의 배수인지 아닌지 확인하기

		boolean num3 = 0 == (num % 3);
		
		System.out.println("3의 배수인가? :"+num3);		
				
	}

}
