package com.sora.patterns.structural.combination;

public class Client {
    public static void main(String[] args) {
        MenuComponent main = new Menu("main", 0);
        main.add(new Menu("main1", 1));
        main.add(new Menu("main2", 1));
        main.add(new Menu("main3", 1));
        main.print();
    }
}
