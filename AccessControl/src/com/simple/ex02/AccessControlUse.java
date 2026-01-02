package com.simple.ex02;

import com.simple.ex01.AccessControlEx01;

public class AccessControlUse {
    public static void main(String[] args) {
        AccessControlEx01 ac = new AccessControlEx01();
        System.out.println(ac.getNum());
        //ac.name = "홍길동";
        ac.setName("홍길동");
//        ac.setNum(1000);
//        ac.shareMoney -= 10000;;

        System.out.println(ac.getNum());
    }
}
