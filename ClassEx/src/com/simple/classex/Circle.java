package com.simple.classex;

public class Circle {
//	private static final int PI = 0;
	private final double PI = 3.141592;
	private String name;
	private int radius; //반지름
	private int x,y; //중심점
	
	public Circle() {
		this.name = "MyCircle";
		this.radius = 5;
		this.x = 10;
		this.y = 20;
		System.out.println("생성자 호출됨...");
		System.out.println("생성자 매개변수"+radius);
	}
	

	public Circle(String name, int radius, int x, int y) {
		this.name = name;
		this.radius = radius;
		this.x = x;
		this.y = y;
		System.out.println("생성자 호출됨...");
		System.out.println("생성자 매개변수"+radius);
	}

	
	public Circle(String name, int radius) {
		this.name = name;
		this.radius = radius;
		x=10;
		y=20;
	}
	
	
	
//	public String getName() {
//		return name;
//	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//		
//	public void setCircle(int r,int x,int y) {
//		radius = r;
//		this.x = x;
//		this.y = y;
//	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	// 원 그리기
	public void drawCircle() {
		System.out.println("원의 크기 "+radius);
		System.out.println("원의 위치 "+x+","+y);		
	}
	
	// 원의 면적
	public double getArea() {
		return PI * radius * radius;
	}


	@Override
	public String toString() {
		return "Circle [PI=" + PI + ", name=" + name + ", radius=" + radius + ", x=" + x + ", y=" + y + "]";
	}
	
	
}
