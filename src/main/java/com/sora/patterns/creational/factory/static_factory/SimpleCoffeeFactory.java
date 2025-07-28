package com.sora.patterns.creational.factory.static_factory;


public class SimpleCoffeeFactory {
    public static Coffee createCoffee(String type){  //静态工厂
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
