package com.simple.condition;

import java.util.Scanner;

public class IfEx01 {

	public static void main(String[] args) {
		// if 제어문
		// 나이를 키보드로 입력 받아서 성년/미성년 여부를 출력
		// 성년기준 : 20세 이상
		
		// 데이터 입력
		// 입출력 변수 준비
		int age;
		String result = null;
		final int AGE20 = 20;
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요 :");
		String age_ = kbd.nextLine();
		age = Integer.parseInt(age_);
				
		// 데이터 처리
		// ★ 성년/미성년 여부 판단 ★ (핵심)
		if(age >= AGE20) {
			result = "성년";
		}
			
		if(age < AGE20) {
			result = "미성년";
					
		}
		
		// 데이터 출력
		System.out.println("나이 :"+age);
		System.out.println("성년/미성년 :"+result);
		
	
		}
	}
	
