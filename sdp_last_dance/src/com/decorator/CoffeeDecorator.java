package com.decorator;

public class CoffeeDecorator implements Coffee{
    Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public Integer getCost() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
