package com.simple.io;

import java.util.Scanner;

public class ScannerEx01 {

	public static void main(String[] args) {
		
		// 사용자로부터 키보드로 값을 입력받는다.
		System.out.println();
		String name="";
		int age;
				
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("이름 :");
		name = kbd.nextLine(); // 기능(키보드에서 글자를 입력받아서 넘겨줌)
		
		System.out.println("나이 :");
		// age = Integer.parseInt(kbd.nextLine()); // 기능(키보드에서 글자를 입력받아서 넘겨줌)
		age = kbd.nextInt(); // 기능(키보드에서 글자를 입력받아서 넘겨줌)
		
		System.out.println("이름 :"+name);
		System.out.println("나이 :"+(age-1));
		
		
	}

}
