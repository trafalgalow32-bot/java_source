package com.simple.inout;

import java.util.Scanner;

public class VmInOut {

	public static void main(String[] args) {
		// 1. 자판기 메뉴 출력
		// 밀크커피(300원)

		// 프로그램에 관련된 입출력 변수 준비
		int inCoin = 0;
		String milkCoffee = "밀크커피";
		int milkPrice = 300;
		boolean milkOk = false;
		int menu;
		int vmCoin = 0;
		String coinRepeat = "n";
		String quit=" ";

		Scanner kbd = new Scanner(System.in);

		do {
		
		// 메뉴 출력
//		System.out.println(milkCoffee+"("+milkPrice+"원)");
		System.out.printf("%s: (%d원) %s\n", milkCoffee, milkPrice, milkOk ? "O" : "X");

		// 동전 입력
		do {
			System.out.println("동전 입력: ");
			inCoin += kbd.nextInt();
			kbd.nextLine();
			
			// 입력한 동전 출력
			System.out.println(" 잔액 : " + inCoin);
			System.out.println("동전입력 계속하나요? y/n");
			coinRepeat = kbd.nextLine();

		} while (coinRepeat.equals("y"));

		// 밀크 커피 판매 가능 상태로 변환 처리
		// 입력한 동전에 300원 이상이면 판매가능 상태 "O"로 변환
		if (inCoin >= milkPrice) {
			milkOk = true;
		}

		// 밀크커피 판매 처리
		// 커피 선택하기
		// 판매에 따른 처리
		System.out.printf("%s: (%d원) %s\n",
				milkCoffee,
				milkPrice,
				milkOk ? "o" : "X");
		
		if(milkOk) {			
		
//		System.out.printf("%s: (%d원) %s\n", milkCoffee, milkPrice, milkOk ? "o" : "X");
		System.out.println("메뉴 선택 : 밀크커피:1 ");
		menu = kbd.nextInt();

		switch (menu) {
		case 1:
			// 자판기가 판매금액 회수
			vmCoin += milkPrice;
			inCoin -= milkPrice;
			System.out.println(milkCoffee + " 나왔습니다.");
		}

		// 밀크커피 상태 체크
		if (inCoin >= milkPrice) {
			milkOk = true;
		} else {
			milkOk = false;
				}
			}
		System.out.printf("%s: (%d원) %s \n", milkCoffee, milkPrice, milkOk ? "o" : "X");
		System.out.println("잔액 : " + inCoin);
		
		kbd.nextLine(); // 키보드 버퍼에 남아있는 문자열 처리
		
		System.out.println("프로그램 종료 : quit 입력 ");
		quit = kbd.nextLine();
		
		} while( ! quit.equals("quit"));
		
		System.out.println("자판기 종료");
	}
			
}
