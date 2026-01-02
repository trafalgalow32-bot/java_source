package com.simple.extend;

public class Main {
    public static void main(String[] args) {
        //객체 생성
        //객체 사용(메시지 교환) : 객체간에 상호작용
        SportCar sport1 = new SportCar("삼성", 5);
        Car car = new Car( "Kia", 4);

        Car car2 = new SportCar("삼성", 5);
        Vehicle v1 = new SportCar("삼성", 5);

        v1.accelerated(200);
        car.honk();
        sport1.start();
        sport1.accelerated( 10);
        sport1.stop();
    }
}