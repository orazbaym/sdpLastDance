package com.adapter;

import java.util.Scanner;

public class PaymentP implements Payment{
    PaymentAdapter adapter;
    @Override
    public void buy(String name , int month) {
        Scanner scanner = new Scanner ( System.in );
        String str = scanner.next ();

        switch (str) {
            case "credit" -> System.out.println ( "You bought " + name + " for " + month + " months for credit with penia for day " + 180 );
            case "installation" , "n" -> {
                adapter = new PaymentAdapter ( name );
                adapter.buy ( name , month );
            }
            default -> System.out.println ( "Invalid payment method! Try again" );
        }
    }
}
