package com.sora.patterns.behavioral.chainofresponsibility;

public class Manager extends Handler{
    public Manager() {
        super(Handler.NUM_ONE, Handler.NUM_THREE);
    }

    @Override
    public void handleLeave(LeaveRequest request) {
        System.out.println("Manager.handleLeave");;
    }
}
