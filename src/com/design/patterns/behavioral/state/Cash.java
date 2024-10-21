package com.design.patterns.behavioral.state;

public enum Cash implements AmountInterface {
    FIFTY(50),
    HUNDRED(100);

    private int value;

    Cash(int i) {
        value = i;
    }

    public int getValue() {
        return value;
    }
}
