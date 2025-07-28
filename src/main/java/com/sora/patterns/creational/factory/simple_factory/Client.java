package com.sora.patterns.creational.factory.simple_factory;

public class Client {
    public static void main(String[] args) {
        CoffeeStore order = new CoffeeStore();
        Coffee latte = order.order("latte");
        latte.getName();
    }
}
