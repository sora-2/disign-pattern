package com.sora.patterns.behavioral.templatemethod;


public class Concrete_Caixin extends AbstractClass {


    @Override
    public void putVeges() {
        System.out.println("炒菜心");
    }

    @Override
    public void putSauce() {
        System.out.println("蒜蓉");
    }
}
