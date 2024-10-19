package com.design.patterns.creational.singleton;

// Eager Initialization
public class Vehicle {
    private static Vehicle instance = new Vehicle();
    public static Vehicle getInstance() {
        return instance;
    }
}
