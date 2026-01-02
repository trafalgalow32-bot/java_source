package com.simple.extend;

public class Car extends Vehicle {
    protected int wheelCount;

    public Car(String brand, int wheelCount) {
        super(brand);
        this.wheelCount = wheelCount;
        System.out.println(" 자동차 생성됨");
    }

    public void honk(){
        System.out.println(brand+" 빵빵!");
    }
}
