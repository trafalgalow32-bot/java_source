package com.simple.Pratice;

import java.util.Scanner;

public class SelfPracticeDec24_4 {

	public static void main(String[] args) {
//		4. 학점 판별하기
//
//		점수를 입력받아 90점 이상은 A, 80점 이상은 B, 70점 이상은 C, 그 외는 F를 출력하세요.
		
		System.out.println("점수를 입력 받아 알맞는 학점을 출력하시오.");
		
		Scanner kbd = new Scanner(System.in);
		int score;
		score = kbd.nextInt();
		
		if(score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");			
		} else if (score >= 70) {
			System.out.println("C");			
		} else {				
			System.out.println("F");}	
		kbd.close();
		}	
	}
