package com.sora.patterns.behavioral.templatemethod;


public class Concrete_Baocai extends AbstractClass {


    @Override
    public void putVeges() {
        System.out.println("炒包菜");
    }

    @Override
    public void putSauce() {
        System.out.println("辣椒");
    }
}
