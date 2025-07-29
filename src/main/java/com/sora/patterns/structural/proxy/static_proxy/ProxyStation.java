package com.sora.patterns.structural.proxy.static_proxy;

public class ProxyStation implements SellTicket{

    private TrainStation trainStation;
    @Override
    public void sell() {
        System.out.println("代理站收费");
        trainStation.sell();
    }
}
