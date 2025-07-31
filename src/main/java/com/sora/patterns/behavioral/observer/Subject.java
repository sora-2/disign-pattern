package com.sora.patterns.behavioral.observer;


public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notify(String msg);
}
