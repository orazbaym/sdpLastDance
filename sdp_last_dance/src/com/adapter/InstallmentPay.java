package com.adapter;

public class InstallmentPay implements AdvancedPayment{
    @Override
    public void forInstallment(String name , int month) {
        //nothing
    }

    @Override
    public void forCredit(String name , int month) {
        System.out.println ("Bought " + name + " for installment for " + month + " months with penia for day of" + 180 + " tenge." );
    }

    @Override
    public void buy(String name) {
        //nothing

    }
}
