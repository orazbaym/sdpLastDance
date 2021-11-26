package com.decorator;

public class Espresso implements Coffee{
    @Override
    public Integer getCost() {
        return 900;
    }

    @Override
    public String getDescription() {
        return "Espresso coffee";
    }
}
