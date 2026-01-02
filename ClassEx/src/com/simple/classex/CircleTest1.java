package com.simple.classex;

public class CircleTest1 {

	public static void main(String[] args) {
		
		// 객체 복사와 객체 생성
		Circle c1 = new Circle();
		Circle c3 = new Circle();
		Circle c2; 
		System.out.println(c1);
		
		c2 = c1; // 객체 주소 복사
		c2.setName("홍길동 원");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3);
	}

}
