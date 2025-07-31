package com.sora.patterns.behavioral.mediator;

public class HouseOwner extends Person{
    public HouseOwner(String name, Mediator mediator) {

        super(name, mediator);
    }

    public void contact(String msg){
        mediator.contact(msg,this);
    }

    public void getMsg(String msg){
        System.out.println("houseOwner " +name+" get the message " + msg);
    }
}
