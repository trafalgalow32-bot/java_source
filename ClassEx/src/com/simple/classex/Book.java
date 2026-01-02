package com.simple.classex;

public class Book {
	String title;
	String author;	
	
	public Book() {
		this("아무책");
		System.out.println("기본 생성자");
	}
	
	
	public Book(String title) {
		// this.title = title;
		// author = "홍길동";
		this(title, "홍길동");		
		System.out.println("제목 생성자");
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		System.out.println("제목, 저자 생성자");
	}
	
	public void showBook() {
		System.out.println("책이름 :"+title);
		System.out.println("책저자 :"+author);
	}
	
	public static void main(String[] args) {
		// 객체 생성 객체 사용
		Book book1 = new Book();
		book1.showBook();
		
	}
}
