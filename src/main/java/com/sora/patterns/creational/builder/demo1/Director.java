package com.sora.patterns.creational.builder.demo1;

public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder=builder;
    }

    public Bike constructor(){
        builder.buildSeat();
        builder.buildFrame();
        return builder.createBike();
    }
}
