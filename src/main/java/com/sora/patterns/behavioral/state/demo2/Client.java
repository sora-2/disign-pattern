package com.sora.patterns.behavioral.state.demo2;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(Context.openingState);
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
