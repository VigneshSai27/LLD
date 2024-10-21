package com.design.patterns.behavioral.state;

public class InsertCashState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public InsertCashState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectProduct(String name) {
        System.out.println("Product is already selected.");
    }

    @Override
    public void insertCash(AmountInterface amount) {
        int total = vendingMachine.getTotalAmount() + amount.getValue();
        vendingMachine.setTotalAmount(total);
        vendingMachine.setCurrentState(vendingMachine.getDispenseState());
        System.out.println("Entered Amount: " + total);
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please insert coin/cash");
    }

    @Override
    public void returnChange() {
        System.out.println("Please insert coin/cash");
    }
}
