package com.sora.patterns.behavioral.observer;

public class WeixinUser implements Observer{

    private String name;

    public WeixinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name+"接收信息："+message);
    }
}
