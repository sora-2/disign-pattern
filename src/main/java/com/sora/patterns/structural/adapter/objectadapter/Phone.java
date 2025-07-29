package com.sora.patterns.structural.adapter.objectadapter;


public class Phone {
    public void charging(Voltage5V v){
        v.output5V();
        System.out.println("charging");
    }
}
