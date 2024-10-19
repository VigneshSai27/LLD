package com.design.patterns.structural.decorator;

public abstract class Beverages {
    String beverageName="";

    String getBeverageName() {
        return beverageName;
    }

    abstract int getPrice();
}
