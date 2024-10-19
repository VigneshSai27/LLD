package com.design.patterns.behavioral.strategy;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid via CreditCard!!");
    }
}
