package com.state;

import com.builder.User;
import com.decorator.Coffee;

public class OrderStatusContext {
    public  OrderStatus status;
    public User user;
    public Coffee coffee;

    public OrderStatusContext(User user, Coffee coffee) {
        this.user = user;
        this.coffee = coffee;
        this.setStatus(new OrderStatusTaken());
    }

    public void setStatus(OrderStatus status){
        this.status = status;
        status.SetContext(this);
        status.printStatus();
    }

    public void nextOrderStatus(){
        status.next();
    }
}
