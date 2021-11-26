package com.state;

public class OrderStatusTaken extends OrderStatus {

    @Override
    public void printStatus() {
        System.out.println("Hi customer " + orderStatusContext.user.getName() + ", your order for " + orderStatusContext.coffee.getDescription() + " is taken and will be started to prepare soon.");
    }

    @Override
    public void next() {
        orderStatusContext.setStatus(new OrderStatusPreparing());
    }
}
