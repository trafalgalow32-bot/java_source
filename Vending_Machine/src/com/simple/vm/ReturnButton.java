package com.simple.vm;

public class ReturnButton {
    private Coin coin;
    private DisplayPanel display;

    public ReturnButton(Coin coin, DisplayPanel display) {
        this.coin = coin;
        this.display = display;
    }

    public void press(){
        int refund = coin.getAmount();
        coin.reset();
        display.showMessage("반환된 금액 :" + refund+"원");
    }
}
