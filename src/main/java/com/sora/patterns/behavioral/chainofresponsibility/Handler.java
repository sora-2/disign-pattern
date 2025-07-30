package com.sora.patterns.behavioral.chainofresponsibility;

public abstract class Handler {
    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;

    private int numStart;
    private int numEnd;

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    private Handler nextHandler;
    public void setNextHandler(Handler handler){
        this.nextHandler=handler;
    }

    public abstract void handleLeave(LeaveRequest request);

    public final void submit(LeaveRequest request){
        this.handleLeave(request);
        if(nextHandler!=null && request.getNum()>this.numEnd){
            this.nextHandler.submit(request);
        }else{
            System.out.println("finish");
        }
    }
}
