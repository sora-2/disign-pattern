package com.sora.patterns.behavioral.interpreter;


import java.util.HashMap;

public class Context {

    private HashMap<Variable,Integer> map = new HashMap<>();

    public void add(Variable variable,Integer integer){
        map.put(variable,integer);
    }
    public int get(Variable variable){
        return map.get(variable);
    }
}
