package com.simple.classex;

public class CircleTest {

	public static void main(String[] args) {
		// Circle Test
		
		// 원을 생성
		Circle c1 = new Circle(); // 다른 패키지 안에 있는 객체면 import 시행해줘야...
		Circle c2 = new Circle(); 
		
//		c1.setCircle(100, 5, 6);
//		c2.setCircle(10, 5, 6);
		
		c1.setName("bigCircle");
		c2.setName("miniCircle");
		
		// 원을 사용
		c1.drawCircle();
		c2.drawCircle();
		
		// 원의 면적 구하기
		double area = c1.getArea();
		double area1 = c2.getArea();
		
		System.out.println("원의 이름 : "+c1.getName());
		System.out.println("원의 이름 : "+c2.getName());
		System.out.println("원의 면적 : "+area);		
		System.out.println("원의 면적 : "+area1);		
	}

}
