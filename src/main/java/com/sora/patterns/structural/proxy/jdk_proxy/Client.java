package com.sora.patterns.structural.proxy.jdk_proxy;

public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTicket proxy = proxyFactory.proxy();
        proxy.sell();
    }
}
