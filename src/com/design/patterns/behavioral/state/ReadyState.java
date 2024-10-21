package com.design.patterns.behavioral.state;

public class ReadyState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public ReadyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectProduct(String name) {
        Product product = vendingMachine.getInventory().getProduct(name);
        if (vendingMachine.getInventory().isAvailable(product)) {
            vendingMachine.setSelectedProduct(product);
            vendingMachine.setCurrentState(vendingMachine.getInsertCashState());
            System.out.println("Selected Product: " + name);
        }
    }

    @Override
    public void insertCash(AmountInterface amount) {
        throw new IllegalStateException("Please select the Product to insert Coin.");
    }

    @Override
    public void dispenseProduct() {
        throw new IllegalStateException("Cannot dispense product. Please select the Product.");
    }

    @Override
    public void returnChange() {
        throw new IllegalStateException("Please select the Product.");
    }
}
