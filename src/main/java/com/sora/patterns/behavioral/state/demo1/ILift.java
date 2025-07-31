package com.sora.patterns.behavioral.state.demo1;

public interface ILift {

    int OPENING_STATE  = 1;
    int CLOSING_STATE = 2;
    int RUNNING_STATE = 3;
    int STOPPING_STATE = 4;

    void setState(int state);

    void run();

    void stop();

    void open();

    void close();
}
