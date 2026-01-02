package com.simple.classex;

public class Circle0 {
//	private static final int PI = 0;
	final double PI = 3.141592;
	int radius=5; //반지름
	int x=10,y=20; //중심점
	
	// 원 그리기
	public void drawCircle() {
		System.out.println("원의 크기"+radius);
		System.out.println("원의 위치"+x+","+y);		
	}
	
	// 원의 면적
	public double getArea() {
		return PI * radius * radius;
	}
}
