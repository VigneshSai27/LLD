package com.design.patterns.structural.decorator;

public class Milk extends IngredientDecorator{
    Beverages beverage;

    public Milk(Beverages beverage) {
        this.beverage = beverage;
    }

    @Override
    String getBeverageName() {
        return beverage.getBeverageName()+" with milk";
    }

    @Override
    int getPrice() {
        return beverage.getPrice()+2;
    }
}
