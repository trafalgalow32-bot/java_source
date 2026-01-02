package com.simple.condition;

import java.util.Scanner;

public class Sungjuk01 {

	public static void main(String[] args) {
		// if 제어문
		// 성적(국어, 영어, 수학)을 키보드로 입력 받아서
		// 총점, 평균, 등급을 구한다.
		// 등급 : 수, 우, 미, 양, 가
		
		// 데이터 입력
		// 입출력 변수 준비
		int kor,eng,mat; //과목변수
		int tot; //총점변수
		double avg; // 평균변수 (평균은 실수이므로 double)
		char grade; // 등급변수
				
		kor = 90;
		eng = 80;
		mat = 90;
		
		// 데이터 처리
		// 총점, 평균 처리
		tot = kor+mat+eng;
		avg = (double)tot/3; // 평균은 실수이므로 그냥 처리하면 안됨!! 형 변환 필수!!
		
		// 등급 처리(수~가)
		if(avg >= 90.0) {
			grade = '수';
		}else if(avg >= 80.0) {
			grade = '우';
		}else if(avg >= 70.0) {
			grade = '미';
		}else if(avg >= 60.0) {
			grade = '양';
		}else {
			grade = '가';
		}
		
		
		// 데이터 출력
		System.out.println("-------------------------------");
		System.out.println("국어  영어 수학  총점   평균   등급");
		System.out.printf("%3d %3d %3d %4d %6.2f %2s \n", 
							kor,eng,mat,tot,avg,grade);
		System.out.println("-------------------------------");
		
		}
	}	
