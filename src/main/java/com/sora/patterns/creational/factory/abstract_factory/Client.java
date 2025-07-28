package com.sora.patterns.creational.factory.abstract_factory;

import com.sora.patterns.creational.factory.factory_method.Coffee;

public class Client {
    public static void main(String[] args) {


        ItalyDessertFactory italyDessertFactory = new ItalyDessertFactory();
        Coffee coffee = italyDessertFactory.createCoffee();
        Dessert dessert = italyDessertFactory.createDessert();
        coffee.getName();
        dessert.show();
    }
}
