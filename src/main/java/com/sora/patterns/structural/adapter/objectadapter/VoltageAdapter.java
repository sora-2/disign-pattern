package com.sora.patterns.structural.adapter.objectadapter;

public class VoltageAdapter implements Voltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    public void output5V(){
        voltage220V.output220V();
        System.out.println("5V");
    }
}
