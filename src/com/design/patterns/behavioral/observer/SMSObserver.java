package com.design.patterns.behavioral.observer;

public class SMSObserver implements Observer {
    String name;
    Observable observable;

    public SMSObserver(String name, Observable observable) {
        this.name = name;
        this.observable = observable;
    }
    @Override
    public void update() {
        String msg = String.format("Hello %s, Your %s stock is available now!! - Informed via SMS",
                name, observable.getName());
        System.out.println(msg);
    }
}
