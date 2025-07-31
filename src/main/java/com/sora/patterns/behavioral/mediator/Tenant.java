package com.sora.patterns.behavioral.mediator;

public class Tenant extends Person{
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void contact(String msg){
        mediator.contact(msg,this);
    }

    public void getMsg(String msg){
        System.out.println("tenant " +name+" get the message " + msg);
    }
}
