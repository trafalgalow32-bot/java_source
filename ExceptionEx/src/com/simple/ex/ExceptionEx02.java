package com.simple.ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx02 {
    public static void main(String[] args) {

        int[] arr = {10,20,30};
        int num = 10;
        Scanner kbd = new Scanner(System.in);


//        System.out.println("정수를 입력하세요");
//        try {
//
//        } catch (InputMismatchException e) {
//            System.out.println(" 정수를 입력하세요");
//        } catch(Exception e) {
//            System.out.println(" 올바른 입력을 해주세요");
//        }
        try {
            int a=3;
            int b = 5/num;

            for (int i = 0; i <= 3; i++) {
                System.out.println(" 배열 원소 :"+arr[i]);
            }
        } catch (IndexOutOfBoundsException e){
//            e.printStackTrace();
            System.out.println("배열 범위 초과했습니다.");
        } catch(NullPointerException e) {
            System.out.println("객체가 없습니다.");
        } catch(RuntimeException e) {
            System.out.println(" 실행시 예외가 발생했습니다.");
        }
        finally {
            // 자원 반납 : 예외가 발생한 자원(자원을 사용하다 예외가 발생하면)
            kbd.close();
            System.out.println(" 키보드 자원을 반납합니다.");
        }
    }
//        System.out.println(" 정상적으로 다음 문장 수행합니다.");
//        String str = kbd.nextLine();
}
