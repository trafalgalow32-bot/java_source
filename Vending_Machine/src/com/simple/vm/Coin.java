package com.simple.vm;

public class Coin {
    private int amount;

    public Coin() {
        amount = 0;
    }

    public Coin(int amount) {
        this.amount = amount;
    }

    public void insert(int value){
        amount += value;
    }

    public int getAmount() {
        return amount;
    }

    public void reset(){
        amount = 0;
    }
}
