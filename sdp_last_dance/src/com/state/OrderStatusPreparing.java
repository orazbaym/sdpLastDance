package com.state;

public class OrderStatusPreparing extends OrderStatus {

    @Override
    public void printStatus() {
        System.out.println("Hi customer " + orderStatusContext.user.getName() + ", your order for " + orderStatusContext.coffee.getDescription() + " is Preparing");
    }

    @Override
    public void next() {
        orderStatusContext.setStatus(new OrderStatusReady());
    }
}