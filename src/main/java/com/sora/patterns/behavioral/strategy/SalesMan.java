package com.sora.patterns.behavioral.strategy;

public class SalesMan {
    private Strategy strategy;

    public SalesMan(Strategy strategy){
        this.strategy = strategy;
    }
    public void show(){
        strategy.show();
    }
}
