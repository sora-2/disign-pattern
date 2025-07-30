package com.sora.patterns.structural.combination;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent{

    private List<MenuComponent> list = new ArrayList<>();

    public Menu(String name,int level){
        super.name = name;
        super.level = level;
    }
    @Override
    public void print() {
        System.out.println(getName());
        list.forEach(MenuComponent::print);
    }

    @Override
    public void add(MenuComponent component) {
        list.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        list.remove(component);
    }

    @Override
    public MenuComponent getChild(int index) {
        return list.get(index);
    }

}
