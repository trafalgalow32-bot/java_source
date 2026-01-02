package com.simple.ex01;

public class AccessControlEx01 {
    private int num;
    private String name;
    protected int shareMoney=100000;

//    public AccessControlEx01() {
//        this.num = 0;
//        this.name = "";
//    }

    public int getNum() {
        return num;
    }

//    public void setNum(int num) {
//        this.num = num;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void test(){
        num=10;
    }

    public static void main(String[] args) {
        AccessControlEx01 ac = new AccessControlEx01();
        ac.name = "홍길동";
    }
}
