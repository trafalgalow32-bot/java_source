package com.simple.array;

public class ArrayEx03 {

	public static void main(String[] args) {
		// 배열 초기화
//		int jumsu = 90; // 이런 과정 자체가 초기화!
//		int jumsu1 = 100;
		 
		int [] scores = {10,20,50,60,78};
		
		for (int i : scores) {
			System.out.print(i+" ");
		}	
		
		System.out.println();
		
		// 문자열 배열 초기화
		String [] topping = 
			{"버섯","양파","소세지","베이컨","토마토"};
		
		for (String str : topping) {
			System.out.print(" "+str);
		}
		
		System.out.println();
		// 문자열 배열로 다루기
		String str = "Hello Java!";
		
		System.out.print("\n"+str);
		System.out.print("\n"+str.charAt(0));
		System.out.print("\n"+str.charAt(1));
		System.out.print("\n"+str.charAt(2));
		System.out.print("\n"+str.charAt(3));
		System.out.print("\n"+str.charAt(4));
		
		
		System.out.println();
		// 문자열 배열로 다루기
		String jumin = "020625-4403619";
		
//		System.out.print("\n"+jumin);
//		System.out.print("\n"+jumin.charAt(0));
//		System.out.print("\n"+jumin.charAt(1));
//		System.out.print("\n"+jumin.charAt(2));
//		System.out.print("\n"+jumin.charAt(3));
//		System.out.print("\n"+jumin.charAt(4));
//		System.out.print("\n"+jumin.charAt(5));
		int year = 2000 + Integer.parseInt(jumin.substring(0, 2)); // " " 안에 있는 내용은 숫자로 쓸 수 없다!
		
		System.out.println("\n" + jumin);
//		System.out.println(jumin.substring(0, 4));
		System.out.println(year);
	}

}
