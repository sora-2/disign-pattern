package com.sora.patterns.creational.factory.factory_method;

public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        AmericanoFactory americanoFactory = new AmericanoFactory();
        coffeeStore.setFactory(americanoFactory);
        Coffee order = coffeeStore.order();
        order.getName();

    }
}
