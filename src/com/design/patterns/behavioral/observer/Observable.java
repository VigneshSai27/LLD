package com.design.patterns.behavioral.observer;

public interface Observable {
    String getName();
    void addStock(int count);
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
