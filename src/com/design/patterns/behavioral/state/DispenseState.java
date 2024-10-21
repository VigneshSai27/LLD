package com.design.patterns.behavioral.state;

public class DispenseState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public DispenseState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectProduct(String name) {
        System.out.println("Product is already selected.");
    }

    @Override
    public void insertCash(AmountInterface amount) {
        System.out.println("Please wait till the product is dispensed.");
    }

    @Override
    public void dispenseProduct() {
        Product product = vendingMachine.getSelectedProduct();
        if (vendingMachine.getTotalAmount() >= product.getPrice()) {
            vendingMachine.getInventory().updateProduct(product, -1);
            vendingMachine.setCurrentState(vendingMachine.getReturnChangeState());
            System.out.println("Please collect dispensed product.");
        } else {
            System.out.println("Entered insufficient amount.");
        }
    }

    @Override
    public void returnChange() {
        System.out.println("Please collect dispensed product.");
    }
}
