package com.sora.patterns.behavioral.chainofresponsibility;

public class GroupLeader extends Handler{
    public GroupLeader() {
        super(0, Handler.NUM_ONE);
    }

    @Override
    public void handleLeave(LeaveRequest request) {
        System.out.println("GroupLeader.handleLeave");;
    }
}
