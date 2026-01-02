package com.simple.calc;

public interface Calculator {
    double calculator(double a,
                      double b);
}

abstract class AbstractCalculator implements Calculator{

    protected String format(double result){
        return "결과값 : " + result;
    }

    public double calculator(int a, int b) {
        return calculator((double) a, (double) b);
    }
}

class AddCaculator extends AbstractCalculator {

    @Override
    public double calculator(double a, double b) {
        return a+b;
    }
}

class SubCaculator extends AbstractCalculator {

    @Override
    public double calculator(double a, double b) {
        return a-b;
    }
}

class MulCaculator extends AbstractCalculator {

    @Override
    public double calculator(double a, double b) {
        return a*b;
    }
}

class DivCaculator extends AbstractCalculator {

    @Override
    public double calculator(double a, double b) {
        if(b==0) throw new ArithmeticException("0으로 나눌 수 없습니다.");
        return a/b;
    }
}