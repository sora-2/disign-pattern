package com.sora.patterns.behavioral.command;

public class Client {
    public static void main(String[] args) {
        Order order1 = new Order();
        order1.setTableNum(1);
        order1.setFood("meat",1);
        order1.setFood("soup",2);
        Order order2 = new Order();
        order2.setTableNum(2);
        order2.setFood("snack",1);
        order2.setFood("coke",2);
        SeniorChef seniorChef = new SeniorChef();
        OrderCommand orderCommand1 = new OrderCommand(order1,seniorChef);
        OrderCommand orderCommand2 = new OrderCommand(order2,seniorChef);

        Waiter waiter = new Waiter();
        waiter.setCommandList(orderCommand1);
        waiter.setCommandList(orderCommand2);
        waiter.orderComing();
    }
}
