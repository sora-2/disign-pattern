package com.sora.patterns.behavioral.visitor;

public class Fail extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("man give result :fail");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("woman give result :fail");
    }
}
