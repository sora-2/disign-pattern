package com.sora.principle.liskovsubstitution.demo2;

public class Rectangle implements Quadrilateral{

    private double length;
    private double width;


    @Override
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getWidth() {
        return width;
    }
}
