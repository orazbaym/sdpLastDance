package com.adapter;

import java.util.Scanner;

public class PaymentAdapter implements Payment {

    AdvancedPayment advancedPayment;

    public PaymentAdapter(String type__of__payment) {
        switch (type__of__payment) {
            case "credit" -> advancedPayment = new CreditPay ();
            case "installation" -> advancedPayment = new InstallmentPay ();
            case "n" -> advancedPayment = new PaymentN ();
        }
    }

    @Override
    public void buy(String name,int month) {
        Scanner scanner = new Scanner ( System.in );
        switch (scanner.next ()) {
            case "credit" -> advancedPayment.forCredit ( name , month );
            case "installation" -> advancedPayment.forInstallment ( name , month );
            case "n" -> advancedPayment.buy ( name );
        }
    }
}
