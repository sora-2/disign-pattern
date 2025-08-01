package com.sora.patterns.behavioral.mediator;

public abstract class Person {
    protected String name;
    protected Mediator mediator;


    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
