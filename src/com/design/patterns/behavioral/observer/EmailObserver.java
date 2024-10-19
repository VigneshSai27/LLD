package com.design.patterns.behavioral.observer;

public class EmailObserver implements Observer {

    String name;
    Observable observable;

    public EmailObserver(String name, Observable observable) {
        this.name = name;
        this.observable = observable;
    }

    @Override
    public void update() {
        String msg = String.format("Hello %s, Your %s stock is available now!! - Informed via Email",
                name, observable.getName());
        System.out.println(msg);
    }
}
