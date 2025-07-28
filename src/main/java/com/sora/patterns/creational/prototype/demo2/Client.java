package com.sora.patterns.creational.prototype.demo2;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation1 = new Citation();
        citation1.setName("jack");
        Citation citation2 = citation1.clone();
        citation2.setName("rose");  //string是不可变类
        System.out.println(citation1.getName());
        System.out.println(citation2.getName());

    }
}
