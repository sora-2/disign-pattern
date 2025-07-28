package com.sora.patterns.creational.factory.factory_method;

public class CoffeeStore {
    private CoffeeFactory factory;


    public Coffee order() {
        Coffee coffee = factory.createCoffee();
        coffee.addSuger();
        coffee.addMilk();
        return coffee;
    }

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }
}