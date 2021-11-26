package com.adapter;

public interface AdvancedPayment {
    void forInstallment(String name, int month);
    void forCredit(String name, int month);
    void buy(String name);
}
