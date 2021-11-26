package com.adapter;

public class PaymentN implements AdvancedPayment {
    @Override
    public void forInstallment(String name , int month) {
        //nothing
    }

    @Override
    public void forCredit(String name , int month) {
        //nothing
    }

    @Override
    public void buy(String name) {
        System.out.println ( "Bought " + name );
    }
}
