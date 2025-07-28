package com.sora.patterns.creational.prototype.demo1;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype realizetype = new Realizetype();

        Realizetype clone = realizetype.clone();

        System.out.println(realizetype == clone);
    }
}
