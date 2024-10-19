package com.design.patterns.structural.adapter;

public class Iphone6s {
    private Iphone4sTo6sAdapter iphone4sTo6sAdapter;

    public Iphone6s(Iphone4sTo6sAdapter iphone4sTo6sAdapter) {
        this.iphone4sTo6sAdapter = iphone4sTo6sAdapter;
    }

    public void charge() {
        iphone4sTo6sAdapter.charge();
    }
}
