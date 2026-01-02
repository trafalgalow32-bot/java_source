package com.simple.staticEx;
class UnitConverter{
    // cm -> m
    public static double cmToMeter(double cm) {
        return cm/100.0;
    }
}


public class UnitTest {
    public static void main(String[] args) {

        UnitConverter.cmToMeter(214.1);

        Math.random();
    }
}
