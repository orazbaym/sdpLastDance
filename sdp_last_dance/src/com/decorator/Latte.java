package com.decorator;

public class Latte implements Coffee{
    @Override
    public Integer getCost() {
        return 800;
    }

    @Override
    public String getDescription() {
        return "Latte Coffee";
    }
}
