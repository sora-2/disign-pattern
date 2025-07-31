package com.sora.patterns.behavioral.visitor;

public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new Man());
        objectStructure.add(new Man());
        objectStructure.add(new Woman());

        Success success = new Success();
        objectStructure.display(success);
        Fail fail = new Fail();
        objectStructure.display(fail);
    }
}
