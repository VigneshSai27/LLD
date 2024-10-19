package com.design.patterns.structural.decorator;

public class Caramel extends IngredientDecorator {
    Beverages beverage;

    public Caramel(Beverages beverage) {
        this.beverage = beverage;
    }

    @Override
    int getPrice() {
        return beverage.getPrice() + 6;
    }

    @Override
    String getBeverageName() {
        return beverage.getBeverageName() + " with caramel";
    }
}
