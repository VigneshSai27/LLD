package com.design.patterns.behavioral.state;

import java.util.Map;

public class VendingMachine implements VendingMachineState{
    public static VendingMachine instance;
    private ReadyState readyState;
    private InsertCashState insertCashState;
    private DispenseState dispenseState;
    private ReturnChangeState returnChangeState;
    private VendingMachineState currentState;
    private Inventory inventory;
    private Product selectedProduct;
    private int totalAmount;

    public VendingMachine() {
        this.readyState = new ReadyState(this);
        this.insertCashState = new InsertCashState(this);
        this.dispenseState = new DispenseState(this);
        this.returnChangeState = new ReturnChangeState(this);
        this.currentState = readyState;
        this.selectedProduct = null;
        this.inventory = new Inventory();
        this.totalAmount = 0;
    }

    public static VendingMachine getInstance() {
        if(instance==null) return new VendingMachine();
        return  instance;
    }

    public ReadyState getReadyState() {
        return readyState;
    }

    public void setReadyState(ReadyState readyState) {
        this.readyState = readyState;
    }

    public InsertCashState getInsertCashState() {
        return insertCashState;
    }

    public void setInsertCashState(InsertCashState insertCashState) {
        this.insertCashState = insertCashState;
    }

    public DispenseState getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(DispenseState dispenseState) {
        this.dispenseState = dispenseState;
    }

    public ReturnChangeState getReturnChangeState() {
        return returnChangeState;
    }

    public void setReturnChangeState(ReturnChangeState returnChangeState) {
        this.returnChangeState = returnChangeState;
    }

    public Product getSelectedProduct() {
        return selectedProduct;
    }

    public void setSelectedProduct(Product selectedProduct) {
        this.selectedProduct = selectedProduct;
    }

    public VendingMachineState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(VendingMachineState currentState) {
        this.currentState = currentState;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public void selectProduct(String name) {
        currentState.selectProduct(name);
    }

    @Override
    public void insertCash(AmountInterface amount) {
        currentState.insertCash(amount);
    }

    @Override
    public void dispenseProduct() {
        currentState.dispenseProduct();
    }

    @Override
    public void returnChange() {
        currentState.returnChange();
    }
}
