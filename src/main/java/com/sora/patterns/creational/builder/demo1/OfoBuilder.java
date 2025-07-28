package com.sora.patterns.creational.builder.demo1;

public class OfoBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("铁车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("塑料车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
