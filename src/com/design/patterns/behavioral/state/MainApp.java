package com.design.patterns.behavioral.state;

public class MainApp {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Product p1 = new Product("COKE", 10);
        Product p2 = new Product("SODA", 50);
        Product p3 = new Product("JUICE", 90);
        Product p4 = new Product("CHOCOLATE", 70);

        inventory.addProduct(p1, 5);
        inventory.addProduct(p2, 8);
        inventory.addProduct(p3, 4);
        inventory.addProduct(p4, 12);

        VendingMachine vendingMachine = VendingMachine.getInstance();
        vendingMachine.setInventory(inventory);
        vendingMachine.selectProduct("COKE");
        vendingMachine.insertCash(Cash.HUNDRED);
        vendingMachine.dispenseProduct();
        vendingMachine.returnChange();

        vendingMachine.selectProduct("SODA");
        vendingMachine.insertCash(Cash.HUNDRED);
        vendingMachine.dispenseProduct();
        vendingMachine.returnChange();


    }
}
