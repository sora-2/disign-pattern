package com.sora.patterns.structural.adapter.classadapter;

public class VoltageAdapter extends Voltage220V implements Voltage5V{
    public void output5V(){
        output220V();
        System.out.println("5V");
    }
}
