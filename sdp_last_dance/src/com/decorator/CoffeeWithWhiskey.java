package com.decorator;

public class CoffeeWithWhiskey extends CoffeeDecorator{

    public CoffeeWithWhiskey(Coffee coffee) {
        super(coffee);
    }

    @Override
    public Integer getCost() {
        return coffee.getCost()+ 1000;
    }

}
