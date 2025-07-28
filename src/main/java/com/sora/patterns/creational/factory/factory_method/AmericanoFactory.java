package com.sora.patterns.creational.factory.factory_method;

public class AmericanoFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new Americano();
    }
}
