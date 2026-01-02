package com.simple.ex;

public class ExceptionEx01 {
    public static void main(String[] args) {
        try {
            int a=0;
            int b = 5/a;
        } catch (IndexOutOfBoundsException e){
//            e.printStackTrace();
            System.out.println("배열 범위 초과했습니다.");
        } catch(NullPointerException e) {
            System.out.println("객체가 없습니다.");
        } catch(RuntimeException e) {
            System.out.println(" 실행시 예외가 발생했습니다.");
        }
        System.out.println(" 정상적으로 다음 문장 수행합니다.");
    }
}
