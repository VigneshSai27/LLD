package com.design.patterns.structural.adapter;

public class Iphone4s implements Iphone {
    @Override
    public void onCharge() {
        System.out.println("Charging iphone");
    }
}
