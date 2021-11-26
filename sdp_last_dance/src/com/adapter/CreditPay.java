package com.adapter;

public class CreditPay implements AdvancedPayment{
    @Override
    public void forInstallment(String name , int month) {
        System.out.println ("Bought " + name + " for installment for " + month + " months.");
    }

    @Override
    public void forCredit(String name , int month) {
        //nothing
    }

    @Override
    public void buy(String name) {
        //nothing
    }
}
