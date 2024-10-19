package com.design.patterns.behavioral.strategy;

public class PaymentService {
    private PaymentStrategy paymentStrategy;

    public PaymentService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    void pay(int amount) {
        paymentStrategy.pay(amount);
    }
}
