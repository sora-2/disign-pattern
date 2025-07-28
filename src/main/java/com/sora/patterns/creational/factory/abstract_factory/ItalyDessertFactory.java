package com.sora.patterns.creational.factory.abstract_factory;

import com.sora.patterns.creational.factory.factory_method.Coffee;
import com.sora.patterns.creational.factory.factory_method.Latte;

public class ItalyDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new Latte();
    }

    @Override
    public Dessert createDessert() {
        return new Mousse();
    }
}
