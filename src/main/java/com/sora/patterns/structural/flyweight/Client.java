package com.sora.patterns.structural.flyweight;

public class Client {
    public static void main(String[] args) {
        AbstractBox box1 = BoxFactory.getInstance().getBox("I");
        box1.display("blue");

        AbstractBox box2 = BoxFactory.getInstance().getBox("L");
        box2.display("green");

        AbstractBox box3 = BoxFactory.getInstance().getBox("O");
        box3.display("red");

        AbstractBox box4 = BoxFactory.getInstance().getBox("O");
        box4.display("gray");

        System.out.println(box3 == box4);
        System.out.println(box2 == box3);
    }
}
