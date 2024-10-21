package com.design.patterns.behavioral.state;

public interface VendingMachineState {
    void selectProduct(String name);
    void insertCash(AmountInterface amount);
    void dispenseProduct();
    void returnChange();
}
