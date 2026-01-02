package com.simple.loop;

import java.util.Scanner;

public class LoopJumsuChart {

	public static void main(String[] args) {
		// 점수 차트 : 점수에 해당하는 별점 표시
		// 점수에 별점을 10으로 나누어 별점 출력
		Scanner kbd = new Scanner(System.in);
		
		int kor = 30;
		int starSize = kor/10;
		System.out.print("국어 : ");
		System.out.print("원하는 모양을 입력하세요.");
		String shape = kbd.nextLine();
		
		for (int i = 0; i < starSize; i++) {
			System.out.print(shape);
		}
		
		System.out.println();
		
		//영어
		int eng = 50;
		starSize = eng/10; //위에서 int 썼으니까 여기서는 안 씀
		System.out.print("영어 : ");
		System.out.print("원하는 모양을 입력하세요.");
		shape = kbd.nextLine(); // 위에서 String 썼으니까 여기서는 안씀
				
		for (int i = 0; i < starSize; i++) {
			System.out.print(shape);
		}
		
		System.out.println();
		
		//수학
		int mat = 80;
		starSize = mat/10;
		System.out.print("수학 : ");
		System.out.print("원하는 모양을 입력하세요.");
		shape = kbd.nextLine(); // 위에서 String 썼으니까 여기서는 안씀
		
		for (int i = 0; i < starSize; i++) {
			System.out.print(shape);
		}
	}
}

