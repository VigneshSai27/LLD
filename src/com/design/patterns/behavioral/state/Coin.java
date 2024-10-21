package com.design.patterns.behavioral.state;

public enum Coin implements AmountInterface {
    FIVE(5),
    TEN(10);

    private int value;

    Coin(int i) {
        value = i;
    }

    public int getValue() {
        return value;
    }
}
