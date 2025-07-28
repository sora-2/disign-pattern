package com.sora.patterns.creational.factory.simple_factory;

public class CoffeeStore {
    public Coffee order(String type){
        SimpleCoffeeFactory simpleCoffeeFactory = new SimpleCoffeeFactory();
        Coffee coffee = simpleCoffeeFactory.createCoffee(type);
        coffee.addMilk();
        coffee.addSuger();
        return coffee;
    }
}
