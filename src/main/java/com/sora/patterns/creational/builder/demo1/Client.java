package com.sora.patterns.creational.builder.demo1;

public class Client {
    public static void main(String[] args) {
        Director director = new Director(new MobikeBuilder());
        Bike bike = director.constructor();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());

    }
}
