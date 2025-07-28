package com.sora.patterns.creational.factory.abstract_factory;

import com.sora.patterns.creational.factory.factory_method.Americano;
import com.sora.patterns.creational.factory.factory_method.Coffee;

public class AmericanDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new Americano();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
