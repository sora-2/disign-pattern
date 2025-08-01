package com.sora.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionSubject implements Subject{

    private List<Observer> weixinUserList = new ArrayList<>();
    @Override
    public void attach(Observer observer) {
        weixinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weixinUserList.remove(observer);
    }

    @Override
    public void notify(String msg) {
        for (Observer observer : weixinUserList) {
            observer.update(msg);
        }
    }
}
