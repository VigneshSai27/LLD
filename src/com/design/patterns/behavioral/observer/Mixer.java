package com.design.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Mixer implements Observable {
    List<Observer> mixerObservers = new ArrayList<>();
    int quantity = 0;

    public String getName() {
        return "Iphone";
    }

    @Override
    public void addStock(int count) {
        quantity += count;
        if (quantity > 0) notifyObserver();
    }

    public int getQuantity() {
        return 10;
    }

    public int getPrice() {
        return 500;
    }

    @Override
    public void addObserver(Observer observer) {
        this.mixerObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.mixerObservers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : mixerObservers) {
            observer.update();
        }
    }
}
