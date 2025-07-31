package com.sora.patterns.behavioral.visitor;

import java.util.LinkedList;
import java.util.List;

public class ObjectStructure {

    private List<Person> list  = new LinkedList<>();

    public void add(Person person){
        list.add(person);
    }

    public void delete(Person person){
        list.remove(person);
    }

    public void display(Action action){
        for (Person person : list) {
            person.accept(action);
        }
    }
}
