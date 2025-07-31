package com.sora.patterns.behavioral.observer;

public class Client {
    public static void main(String[] args) {
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();

        subscriptionSubject.attach(new WeixinUser("jack"));
        subscriptionSubject.attach(new WeixinUser("rose"));
        subscriptionSubject.attach(new WeixinUser("dick"));

        subscriptionSubject.notify("设计模式快完了");
    }
}
