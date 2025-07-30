package com.sora.patterns.behavioral.command;

import java.util.HashMap;

public class Order {
    private int tableNum;

    private HashMap<String,Integer> map=new HashMap<>();

    public int getTableNum() {
        return tableNum;
    }

    public void setTableNum(int tableNum) {
        this.tableNum = tableNum;
    }

    public HashMap<String, Integer> getMap() {
        return map;
    }

    public void setFood(String name,Integer num) {
        map.put(name,num);
    }
}
