package com;


import com.builder.User;
import com.builder.UserBuilder;
import com.decorator.Cappuccino;
import com.decorator.Coffee;
import com.decorator.CoffeeWithMilk;
import com.decorator.CoffeeWithWhiskey;
import com.facade.SQLQuery;
import com.state.OrderStatusContext;
import com.adapter.*;

public class Main {

    public static void main(String[] args) {
        // Using builder
        User newUser1 =  new UserBuilder()
                .withName("John")
                .withSurname("Smith")
                .withUsername("johnsmith")
                .withCvv("12342134")
                .withAccount(1)
                .withAge(18)
                .build();

        // Using the decorator
        Coffee newUsers1Coffee = new CoffeeWithWhiskey(new Cappuccino());

        //Using the state
        OrderStatusContext context = new OrderStatusContext(newUser1,newUsers1Coffee);
        context.nextOrderStatus();
        context.nextOrderStatus();

        // Executing facade and Singleton inside facade
        SQLQuery query = new SQLQuery();
        //query.query();


        // Adapter pattern
        Payment meTryingToPay = new PaymentAdapter("credit");




    }
}
