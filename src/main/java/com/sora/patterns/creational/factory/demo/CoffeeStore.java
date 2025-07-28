package com.sora.patterns.creational.factory.demo;

public class CoffeeStore {


    public Coffee order(String type){
        Coffee coffee = null;
        if("americano".equals(type)){
            coffee = new Americano();
        } else if ("latte".equals(type)) {
            coffee = new Latte();
        }else{
            throw new RuntimeException("点的什么勾八");
        }
        coffee.addMilk();
        coffee.addSuger();
        return coffee;
    }
}
