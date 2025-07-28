package com.sora.patterns.creational.factory.abstract_factory;

import com.sora.patterns.creational.factory.factory_method.Coffee;

public interface DessertFactory {
    Coffee createCoffee();
    Dessert createDessert();
}
