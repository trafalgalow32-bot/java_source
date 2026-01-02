package com.simple.classex;

public class Rectangle {
	int width;
	int height;
	
	
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public double getArea() {
		return width*height;
	}
	@Override
	public String toString() {
		return "사각형 [너비:" + width + ", 높이:" + height + "]";
	}
//	"사각형 < 너비 :" + width + ", 높이 :" + height + ">"
	
	
	
}
