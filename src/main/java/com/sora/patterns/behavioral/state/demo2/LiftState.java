package com.sora.patterns.behavioral.state.demo2;

public abstract class LiftState {
    protected Context context;


    public abstract void run();
    public abstract void close();
    public abstract void open();
    public abstract void stop();

    public void setContext(Context context) {
        this.context = context;
    }
}
