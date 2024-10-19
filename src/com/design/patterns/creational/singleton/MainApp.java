package com.design.patterns.creational.singleton;

public class MainApp {
    public static void main(String[] args) {
        Vehicle vehicle = Vehicle.getInstance();
        Fish fish = new Fish();
        Human human = new Human();
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        enumSingleton.setName("Happy!!");
        System.out.println(enumSingleton.getName());
    }
}
