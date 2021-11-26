package com.decorator;

public class CoffeeWithMilk extends CoffeeDecorator{

    public CoffeeWithMilk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public Integer getCost() {
        return coffee.getCost() + 200;
    }
}
