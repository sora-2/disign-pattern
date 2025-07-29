package com.sora.patterns.structural.proxy.static_proxy;

public class Client {
    public static void main(String[] args) {
        ProxyStation proxyStation = new ProxyStation();
        proxyStation.sell();
    }
}
