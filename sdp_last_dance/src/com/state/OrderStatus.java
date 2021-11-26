package com.state;

public abstract class OrderStatus {
    public OrderStatusContext orderStatusContext;
    public void SetContext(OrderStatusContext orderStatusContext){
        this.orderStatusContext = orderStatusContext;
    }
    public abstract void printStatus();
    public abstract void next();

}
