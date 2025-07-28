package com.sora.patterns.creational.builder.demo2;

public class Client {
    public static void main(String[] args) {
        Phone build = new Phone
                .Builder()
                .cpu("intel")
                .mainboard("asus")
                .memory("kingston")
                .screen("samsung")
                .build();
        System.out.println(build);
    }
}
