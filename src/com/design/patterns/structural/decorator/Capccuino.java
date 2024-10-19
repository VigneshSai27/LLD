package com.design.patterns.structural.decorator;

public class Capccuino extends Beverages{
    public Capccuino() {
        beverageName="Capccuino";
    }

    @Override
    int getPrice() {
        return 12;
    }
}
