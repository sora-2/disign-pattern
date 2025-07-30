package com.sora.patterns.structural.combination;

public class MenuItem extends MenuComponent{
    public MenuItem(String name,int level){
        super.level=level;
        super.name=name;
    }
    @Override
    public void print() {
        System.out.println(name);
    }
}
