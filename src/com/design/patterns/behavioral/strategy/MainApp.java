package com.design.patterns.behavioral.strategy;

public class MainApp {
    public static void main(String[] args) {
        PaymentStrategy creditCard = new CreditCardPayment();
        PaymentService paymentService = new PaymentService(creditCard);
        paymentService.pay(1000);

        PaymentStrategy paypal = new PaypalPayment();
        paymentService = new PaymentService(paypal);
        paymentService.pay(1000);
    }
}
