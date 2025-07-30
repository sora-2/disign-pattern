package com.sora.patterns.structural.combination;

public abstract class MenuComponent {
    protected int level;
    protected String name;

    public void add(MenuComponent component){
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent component){
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int index){
        throw new UnsupportedOperationException();
    }
    public String getName(){
        return name;
    }
    public abstract void print();
}
