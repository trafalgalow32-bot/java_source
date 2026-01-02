package com.simple.vm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
    private Coin coin;
    private DisplayPanel display;
    private ReturnButton returnButton;
    private ProductOutput output;
    private List<Coffee> menu;

    public VendingMachine(Coin coin, DisplayPanel display, ReturnButton returnButton, ProductOutput output) {
        this.coin = coin;
        this.display = display;
        this.returnButton = returnButton;
        this.output = output;

        //  커피 메뉴 구성
        menu = new ArrayList<>();
        menu.add(new Coffee( "아메리카노",  1000));
        menu.add(new Coffee( "카페라떼",  1500));
        menu.add(new Coffee( "카푸치노",  2000));
    }

    public void showMenu(){
        display.showMenu(menu,coin.getAmount());
    }

    public void insertCoin(int value){
        coin.insert(value);
        display.showMessage("현재 잔액 :"+coin.getAmount()+"원");
    }


    // 메뉴 선택
    public void selectCoffee(int index){
        if(index < 0 || index >= menu.size()){
            display.showMessage("잘못된 메뉴 선택입니다.");
            return;
        }

        Coffee coffee = menu.get(index);

        if(coin.getAmount() >= coffee.getPrice()){
            // 커피판매 처리
            coin.insert(-coffee.getPrice());
            output.dispense(coffee);
            display.showMessage("잔액 "+coin.getAmount()+"원");
        } else {
            display.showMessage("잔액부족 "+coffee.getPrice()+"원이 필요합니다.");
        }

    }

    // 반환버튼 기능
    public void pressReturnButton(){
        returnButton.press();
    }

    public static void main(String[] args){
        // 무대, 연출
        Scanner kbd = new Scanner(System.in);
        Coin coin = new Coin();
        DisplayPanel display = new DisplayPanel();
        ProductOutput output = new ProductOutput();
        ReturnButton returnButton = new ReturnButton(coin, display);

        VendingMachine vm = new VendingMachine(coin,display,returnButton,output);
        // 무한반복 구조
        while (true){
            vm.showMenu();
            System.out.println("1. 동전 투입 | 2. 커피 선택 | 3. 반환버튼 | 0. 종료");
            System.out.print("선택 : ");
            int choice = kbd.nextInt();

            switch (choice){
                case 0:
                    System.out.println(" 자판기를 종료합니다.");
                    return;
                case 1:
                    System.out.println(" 투입한 금액 입력: ");
                    int money = kbd.nextInt();
                    vm.insertCoin(money);
                    break;
                case 2:
                    System.out.println(" 커피 번호 선택 :");
                    int coffeeIndex = kbd.nextInt();
                    vm.selectCoffee(coffeeIndex);
                    break;

                case 3:
                    vm.pressReturnButton();
                    break;
                default:
                    System.out.println(" 잘못된 메뉴 선택입니다.");
            }

            System.out.println("계속하려면 Enter를 누르세요");
            kbd.nextLine();
        }
    }

}
