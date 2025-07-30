package com.sora.patterns.behavioral.chainofresponsibility;

public class GeneralManager extends Handler{
    public GeneralManager() {
        super(Handler.NUM_THREE, Handler.NUM_SEVEN);
    }

    @Override
    public void handleLeave(LeaveRequest request) {
        System.out.println("GeneralManager.handleLeave");;
    }
}
