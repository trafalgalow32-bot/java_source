package com.simple.condition;

import java.util.Scanner;

public class IfElseifEx01 {

	public static void main(String[] args) {
		// if else 제어문
		// 나이를 키보드로 입력 받아서 
		// 나이에 맞는 연령대를 출력	
		// 14 -> 10대, 54 ->50대
		
		// 데이터 입력
		// 입출력 변수 준비
		int age;
		String result = null; // null 대신 ""도 가능
				
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요 :");
		String age_ = kbd.nextLine();
		age = Integer.parseInt(age_);
				
		// 데이터 처리
		// 연령대 판별
		if(age >= 10 && age < 20) {
			result = "10대";
		}else if(age >= 20 && age < 30) {
			result = "20대";
		}else if(age >= 30 && age < 40) {
			result = "30대";
		}else if(age >= 40 && age < 50) {
			result = "40대";
		}else if(age >= 50 && age <60){
			result = "50대";
		}else {
			result = "그외 연령대";
		}
				
		// 데이터 출력
		System.out.println("나이 :"+age);
		System.out.println("연령대 :"+result);
			
		}
	}
	
