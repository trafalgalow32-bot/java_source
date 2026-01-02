package com.simple.operator;

public class OperatorRelation2 {

	public static void main(String[] args) {
		
		// 논리 연산자
		// &&, ||, !
		// 자격증 시험 합격여부 판단
		// 1차 필기 60점이상이고 과목은 국어, 영어, 수학
		// 과목점수는 최소 40점이상
		
		// 입출력 변수 설계(준비)
		int kor = 59; // 국어
		int eng = 60; // 영어
		int mat = 70; // 수학
		double avg; 
		
		// String pass="합격";
		boolean pass1; // 과목과락
		boolean pass2; // 필기합격
		
		// 과목과락 체크
		pass1 = (kor >= 40) && 
				(eng >= 40) && 
				(mat >= 40);
		
		// 평균점수
		avg = (double)(kor+eng+mat)/3; // 정수만 있으니, 실수 double 포함 필수!!
		pass2 = pass1 && avg >= 60;
				
		//결과 출력
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+mat);		
		System.out.println("합격:"+pass2);		

	}
}
