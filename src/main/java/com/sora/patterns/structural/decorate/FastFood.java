package com.sora.patterns.structural.decorate;

public abstract class FastFood {
    private float price;
    private String desc;
    public FastFood(){

    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    public abstract float cost();
}
