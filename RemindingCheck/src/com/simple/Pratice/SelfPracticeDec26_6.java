package com.simple.Pratice;

import java.util.Scanner;

public class SelfPracticeDec26_6 {

	public static void main(String[] args) {
//	6. 최댓값 구하기 (세 수)
// 세 정수를 입력받아 가장 큰 수를 출력하세요.
		
	System.out.println("세 개의 정수를 입력하시오.");
	
	Scanner kbd = new Scanner(System.in);
	
	int a = kbd.nextInt();
	int b = kbd.nextInt();
	int c = kbd.nextInt();
	// 여기까진 오케이!
//	String result = "";
	// result도 좋지만, max로 지정하고, 이거를 'a'로 지정. 더구나 변수 타입은 string이 아닌, int!
	int result = a;
	
	// if를 먼저 작성 후 else로 이어가기 보다는, if 조건을 두 개 연달아 제시하는 게 더 나음!
//	if (a > b) {
//	result = a;
//	} else
	
	if (b > result) {
		result = b;
	} if ( c > result ) {
		result = c;
	}
	System.out.println("가장 큰 수 : "+ result);
	kbd.close();
}
	}
