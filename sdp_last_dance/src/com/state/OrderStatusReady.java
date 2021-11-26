package com.state;

public class OrderStatusReady extends OrderStatus {

    @Override
    public void printStatus() {
        System.out.println("Hi customer " + orderStatusContext.user.getName() + ", your order for " + orderStatusContext.coffee.getDescription() + " is Ready");
    }

    @Override
    public void next() {
        printStatus();
    }
}