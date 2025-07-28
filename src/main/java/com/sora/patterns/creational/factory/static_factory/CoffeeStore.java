package com.sora.patterns.creational.factory.static_factory;

public class CoffeeStore {
    public Coffee order(String type){
//        SimpleCoffeeFactory simpleCoffeeFactory = new SimpleCoffeeFactory();
//        Coffee coffee = simpleCoffeeFactory.createCoffee(type);
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);   //静态工厂模式
        coffee.addMilk();
        coffee.addSuger();
        return coffee;
    }
}
