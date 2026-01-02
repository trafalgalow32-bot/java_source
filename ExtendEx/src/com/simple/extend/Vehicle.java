package com.simple.extend;

public class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle() {
        this("samsung");
    }

    public Vehicle(String brand) {
        this.brand = brand;
        this.speed = 0;
        System.out.println(" 탈것 생섬됨");
    }

    public void start(){
        System.out.println(brand+" 시동을 켭니다.");
    }
    public void stop(){
        System.out.println(brand+" 정지합니다.");
    }

    public void accelerated(int amount) {
        speed += amount;
        System.out.println(" 현재 속도 : "+speed+"km/h");
    }

}



