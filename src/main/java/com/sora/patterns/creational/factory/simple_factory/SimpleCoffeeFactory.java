package com.sora.patterns.creational.factory.simple_factory;



public class SimpleCoffeeFactory {
    public Coffee createCoffee(String type){
        Coffee coffee = null;
        if("americano".equals(type)){
            coffee = new Americano();
        } else if ("latte".equals(type)) {
            coffee = new Latte();
        }else{
            throw new RuntimeException("点的什么勾八");
        }
        return coffee;
    }

}
