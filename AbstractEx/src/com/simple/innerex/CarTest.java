package com.simple.innerex;
class Car{
    private String model;

    public Car(String model) {
        this.model = model;
    }

    static class Engine {
        public void start(){
            System.out.println(" 엔진 시동을 겁니다.");
        }
    }

    public String getModel() {
        return model;
    }
}

public class CarTest {
    public static void main(String[] args) {

        Car.Engine engine = new Car.Engine();

        Car car = new Car("Kia");
        engine.start();

        System.out.println(car.getModel());
    }
}
