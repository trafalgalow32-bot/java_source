package com.simple.Pratice;

import java.util.Scanner;

public class SelfPracticeDec30_10 {

	public static void main(String[] args) {
//	10. 문자 판별하기
// 문자를 입력받아 알파벳 대문자인지, 소문자인지, 숫자인지 판별하세요. (이건 무리.... 오픈북!!)
	
	Scanner kbd = new Scanner(System.in);
	char ch = kbd.next().charAt(0);
	if(Character.isUpperCase(ch)) {
			System.out.println("대문자");
		} else if(Character.isLowerCase(ch)) {
			System.out.println("소문자");
		} else if(Character.isDigit(ch)) {
			System.out.println("숫자");		
		} else {
			System.out.println("기타 문자");
		kbd.close();
		}
	}
}
		
