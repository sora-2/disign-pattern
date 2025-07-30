package com.sora.patterns.behavioral.templatemethod;

public abstract class AbstractClass {
    public void pourOil(){
        System.out.println("倒油");
    }
    public void heatOil(){
        System.out.println("热油");
    }

    public abstract void putVeges();

    public abstract void putSauce();

    public void fry(){
        System.out.println("翻炒");
    }

    public final void process(){
        pourOil();
        heatOil();
        putVeges();
        putSauce();
        fry();
    }
}
