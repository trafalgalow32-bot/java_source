package com.simple.vm;

public class Coffee {
    private String name;
    private int price;

    // 커피 생성자
    public Coffee(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
