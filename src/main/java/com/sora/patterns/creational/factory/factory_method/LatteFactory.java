package com.sora.patterns.creational.factory.factory_method;

public class LatteFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new Latte();
    }
}
