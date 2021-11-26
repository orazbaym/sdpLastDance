package com.decorator;

public class CoffeeWithSteamedMilk extends CoffeeDecorator{

    public CoffeeWithSteamedMilk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public Integer getCost() {
        return coffee.getCost() + 300;
    }
}
