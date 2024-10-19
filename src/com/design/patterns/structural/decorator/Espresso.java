package com.design.patterns.structural.decorator;

public class Espresso extends Beverages {
    public Espresso() {
        beverageName = "Espresso coffee";
    }

    @Override
    int getPrice() {
        return 10;
    }
}
