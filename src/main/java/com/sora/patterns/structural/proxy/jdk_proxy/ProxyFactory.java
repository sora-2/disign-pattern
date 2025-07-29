package com.sora.patterns.structural.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    private TrainStation trainStation = new TrainStation();

    public SellTicket proxy(){
        SellTicket proxyInstance = (SellTicket) Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("ProxyFactory.invoke");
                    method.invoke(trainStation,args);
                    return null;
                }

        );

        return proxyInstance;
    }
}
