package com.design.patterns.structural.adapter;

public class MainApp {
    public static void main(String[] args) {
        Iphone4sTo6sAdapter iphone4sTo6sAdapter=new Iphone4sTo6sAdapter();
        Iphone6s iphone6s=new Iphone6s(iphone4sTo6sAdapter);
        iphone6s.charge();
    }
}
