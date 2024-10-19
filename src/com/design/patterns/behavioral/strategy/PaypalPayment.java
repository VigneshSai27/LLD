package com.design.patterns.behavioral.strategy;

public class PaypalPayment implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("Paid via Paypal!!");
    }
}
