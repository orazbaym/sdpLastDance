package com.decorator;

public class Cappuccino implements Coffee{
    @Override
    public Integer getCost() {
        return 850;
    }

    @Override
    public String getDescription() {
        return "Cappuccino coffee";
    }
}
