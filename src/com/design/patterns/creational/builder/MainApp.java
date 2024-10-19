package com.design.patterns.creational.builder;

public class MainApp {
    public static void main(String[] args) {
        Laptop laptop=new Laptop();
        laptop.setCompany("Dell").setPrice(900000L).setProcessor("i7").setRam("16gb");
        System.out.println(laptop);

        Laptop laptop1=new Laptop();
        laptop1.setCompany("Dell").setPrice(650000L).setProcessor("i5");
        System.out.println(laptop1);
    }
}
