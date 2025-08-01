package com.sora.patterns.structural.flyweight;

public abstract class AbstractBox {
    public abstract String getShape();

    public void display(String color){
        System.out.println("方块形状：" + this.getShape() + " 颜色：" + color);
    }
}
