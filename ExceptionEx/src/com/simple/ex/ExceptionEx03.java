package com.simple.ex;

import java.util.Scanner;

public class ExceptionEx03 {

    static void check(int num) {
        if (num < 0) {
            throw new NumberFormatException(" >> 0보다 작은 값입니다.");
        } else {
            System.out.println("전달값 : " + num);
        }
    }

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println(" 숫자를 입력하세요.");
        int num = kbd.nextInt();
        try {
            if(num < 0)
                throw new NumberFormatException(" 0 보다 작습니다.");
            else
                System.out.println(num);

            check(num);

        } catch (NumberFormatException e) {
            System.out.println("예외발생" + e);
        }

        System.out.println("프로그램 종료");
    }
}
