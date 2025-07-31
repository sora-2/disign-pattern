package com.sora.patterns.behavioral.visitor;

public class Success extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("man give result :Success");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("woman give result :Success");
    }
}
