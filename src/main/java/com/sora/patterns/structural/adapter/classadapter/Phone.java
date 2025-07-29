package com.sora.patterns.structural.adapter.classadapter;

public class Phone {
    public void charging(Voltage5V v){
        v.output5V();
        System.out.println("charging");
    }
}
