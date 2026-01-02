package com.simple.vm;

import java.util.List;

public class DisplayPanel {
    public void showMenu(List<Coffee> menu, int balance ){
        System.out.println("\n===== 커피 자판기 메뉴 =====");
        for (int i = 0; i < menu.size(); i++) {
            Coffee coffee = menu.get(i);
            String status = (balance >= coffee.getPrice())? "O" : "X";
            System.out.printf("%d. %s (%d원) [%s]\n",
                    i, coffee.getName(),coffee.getPrice(),status);
        }
        System.out.println("===========================");
        System.out.println("현재 잔액 : "+balance+"원");
    }

    public void showMessage(String message){
        System.out.println("[디스플레이] "+ message);
    }
}
