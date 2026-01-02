package com.simple.array;

public class ArrayEx01 {

	public static void main(String[] args) {
		// 배열기초 : 1차원 배열 n개의 데이터를 저장
		// 배열 준비
		int[] sungjuk = new int[10];
		int jumsu = 40;

		int size = sungjuk.length;
		// for 문으로 10개의 데이터 채우기
		for(int i=0; i < size; i++) {
			
		// 점수10개를 생성하여 배열에 넣기
		jumsu += 5;
		sungjuk[i] = jumsu;			
		}
		
		System.out.println(" 성적배열 출력");
		
		int num;
		for(int i=0; i < size; i++) {
			num = sungjuk[i];
			System.out.print(num+" ");
			 			
		}
		System.out.println();
		
		// 배열 처리
		// 점수 총점
		int tot=0;
		for (int jum : sungjuk) {
			// tot = tot + jum;
			tot += jum;
			System.out.print(" "+jum);
		}
		
		System.out.println();
		
		// 평균 출력
		double avg = tot / (double)size;
		System.out.printf("총점 : %d \n",tot);
		System.out.printf(" 평균 : %.2f \n",avg);
		
	}

}
