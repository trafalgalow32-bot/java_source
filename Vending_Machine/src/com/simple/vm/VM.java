package com.simple.vm;

import java.util.Scanner;

public class VM {

    public static void main(String[] args) {
        // 1. 자판기 메뉴 출력
        // 밀크커피(300원)

        // 프로그램에 관련된 입출력 변수 준비
        int inCoin = 0;

        String[] coffeeNames = {"밀크커피","설탕커피","블랙커피"};
        int[] coffeePrice = {300,200,100};
        boolean[] isSale = {false,false,false};

        int menu;
        int vmCoin = 0;
        String coinRepeat = "n";
        String quit = "";

        Scanner kbd = new Scanner(System.in);

        do {
            // 커피 메뉴 출력
            // System.out.println(milkCoffee+"("+milkPrice+"원)");
            for(int i=0; i<coffeeNames.length; i++ ) {
                System.out.printf("%s:(%d원) %s\n",
                        coffeeNames[i], coffeePrice[i], isSale[i] ? "○" : "X");
            }

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
            // 입력한 동전이 300원 이상이면 판매가능 상태 "O"로 변환
			for (int i = 0; i < coffeePrice.length; i++){
                if(inCoin >= coffeePrice[i]){
                    isSale[i] = true;
                }  else {
                    isSale[i] = false;
                }
            }

            // 밀크커피 판매 처리
            // 커피 선택하기
            // 판매에 따른 처리
            //System.out.printf("%s:(%d원) %s\n", milkCoffee, milkPrice, milkOk ? "○" : "X");
            // 메뉴 표시
            for (int i = 0; i < coffeePrice.length; i++){
                System.out.printf("%s:(%d원) %s\n",
                        coffeeNames[i], coffeePrice[i], isSale[i] ? "○" : "X");
            }

            System.out.println("메뉴 선택(1~"+ coffeeNames.length+"):");
			menu = kbd.nextInt();
            kbd.nextLine();

            // 선택한 메뉴가 판매 가능한지 검증
            if(menu < 1 || menu > coffeePrice.length){
                System.out.println("잘못된 메뉴 번호입니다.");
                continue;
            }

            int index = menu - 1;

            // 선택한 메뉴가 판매 가능한지 체크
            if(!isSale[index]){
                System.out.println("잔액이 부족하여 구매할 수 없습니다.");
            } else {
                // 판매처리
                vmCoin += coffeePrice[index];
                inCoin -= coffeePrice[index];
                System.out.println(coffeeNames[index]+" 나왔습니다.");
                System.out.println(" 잔액 :"+inCoin);
            }

            // 판매 가능한 상태 처리
            for (int i = 0; i < coffeePrice.length; i++){
                isSale[i] = inCoin >= coffeePrice[i];
            }

            // 메뉴 표시
            for (int i = 0; i < coffeePrice.length; i++){
                System.out.printf("%s:(%d원) %s\n",
                        coffeeNames[i], coffeePrice[i], isSale[i] ? "○" : "X");
            }

            kbd.nextLine(); // 키보드 버퍼에 남아있는 문자열 처리

            System.out.println("프로그램 종료 : quit 입력 ");
            quit = kbd.nextLine();

        } while (!quit.equals("quit"));

        System.out.println("자판기 종료");
    }
}
