package com.design.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Iphone implements Observable {
    List<Observer> iphoneObservers = new ArrayList<>();

    int quantity = 0;
    public String getName() {
        return "Iphone";
    }

    @Override
    public void addStock(int count) {
        quantity+=count;
        if(quantity>0) notifyObserver();
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return 500;
    }

    @Override
    public void addObserver(Observer observer) {
        this.iphoneObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.iphoneObservers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : iphoneObservers) {
            observer.update();
        }
    }
}
