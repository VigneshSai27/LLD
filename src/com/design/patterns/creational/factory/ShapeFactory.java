package com.design.patterns.creational.factory;

public class ShapeFactory {

    public Shape getShape(String type) {
        if(type.equals("Circle")) return new Circle();
        else if(type.equals("Rectangle")) return new Rectangle();
        return null;
    }
}
