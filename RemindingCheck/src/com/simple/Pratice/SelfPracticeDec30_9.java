package com.simple.Pratice;

import java.util.Scanner;

public class SelfPracticeDec30_9 {

	public static void main(String[] args) {
//	9. 합격/불합격 판별하기
// 점수를 입력받아 60점 이상이면 합격, 아니면 불합격을 출력하세요.
	System.out.println("점수를 입력하시오.");
	Scanner kbd = new Scanner(System.in);
	int score = kbd.nextInt();
	
	if(score > 100 || score <0 ) {
		System.out.println("0~100점 사이의 점수를 입력해주시기 바랍니다.");
	} else if (score >= 60) {
		System.out.println("합격");
	} else {
		System.out.println("불합격");
	}
	kbd.close();
	
	}
}
		
