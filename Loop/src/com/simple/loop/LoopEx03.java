package com.simple.loop;

public class LoopEx03 {

	public static void main(String[] args) {
		
		// 아스키 코드표 출력
		char c = 'A';
		
//		for(int i=0; i<60; i++) {
//			System.out.println("문자 :"+c);
//			c++; // c=c++이랑 다르니까 구분 유의!!
//		}
				
		// 대문자 A~Z까지만 출력
		// while문을 사용해서 출력
		do {
			System.out.print(c);
			System.out.print(" : ");
			System.out.printf("%d \n",(int)c);
//			System.out.println(c+0);
			c++;
		}while(c != '[');
		
	}
}
