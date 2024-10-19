package com.design.patterns.structural.adapter;

public class Iphone4sTo6sAdapter {
    Iphone iphone;

    public Iphone4sTo6sAdapter() {
        this.iphone = new Iphone4s();
    }

    public void charge() {
        iphone.onCharge();
    }
}
