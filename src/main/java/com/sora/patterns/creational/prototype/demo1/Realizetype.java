package com.sora.patterns.creational.prototype.demo1;

public class Realizetype implements Cloneable{
    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        return (Realizetype) super.clone();
    }
}
