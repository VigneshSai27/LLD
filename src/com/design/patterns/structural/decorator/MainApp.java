package com.design.patterns.structural.decorator;

public class MainApp {
    public static void main(String[] args) {
        Beverages beverages=new Espresso();
        System.out.println(beverages.getBeverageName()+": "+beverages.getPrice());
        beverages=new Milk(beverages);
        System.out.println(beverages.getBeverageName()+": "+beverages.getPrice());
        beverages=new Caramel(beverages);
        beverages=new Caramel(beverages);
        System.out.println(beverages.getBeverageName()+": "+beverages.getPrice());
    }
}
