package com.sora.patterns.creational.factory.config_factory;



public class Client {
    public static void main(String[] args) {
        Coffee americano = CoffeeFactory.createCoffee("americano");
        americano.getName();

        Coffee latte = CoffeeFactory.createCoffee("latte");
        latte.getName();
    }
}
