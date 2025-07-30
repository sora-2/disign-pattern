package com.sora.patterns.behavioral.command;

public class OrderCommand implements Command{
    private Order order;

    private SeniorChef seniorChef;

    public OrderCommand(Order order, SeniorChef seniorChef) {
        this.order = order;
        this.seniorChef = seniorChef;
    }

    @Override
    public void exec() {
        System.out.println(order.getTableNum() +"order ：");
        order.getMap().entrySet().stream().forEach((set)->seniorChef.cook(set.getKey(),set.getValue()));
    }
}
