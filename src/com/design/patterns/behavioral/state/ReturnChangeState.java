package com.design.patterns.behavioral.state;

public class ReturnChangeState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public ReturnChangeState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectProduct(String name) {
        System.out.println("Please collect return.");
    }

    @Override
    public void insertCash(AmountInterface amount) {
        System.out.println("Please collect return.");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please collect return.");
    }

    @Override
    public void returnChange() {
        if (vendingMachine.getTotalAmount() > vendingMachine.getSelectedProduct().getPrice()) {
            int change = vendingMachine.getTotalAmount() -
                    vendingMachine.getSelectedProduct().getPrice();
            vendingMachine.setTotalAmount(0);
            System.out.println("Please collect the change of: " + change);
        }
        vendingMachine.setCurrentState(vendingMachine.getReadyState());
    }
}
