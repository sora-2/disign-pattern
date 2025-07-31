package com.sora.patterns.behavioral.state.demo2;

public class Context {

    public final static OpeningLift openingState = new OpeningLift();
    public final static ClosingLift closingState  = new ClosingLift();
    public final static RunningLift runningState  = new RunningLift();
    public final static StoppingLift stoppingState  = new StoppingLift();

    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }
    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }
}
