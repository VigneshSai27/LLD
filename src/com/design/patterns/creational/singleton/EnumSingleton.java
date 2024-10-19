package com.design.patterns.creational.singleton;

// By default, Enum classes always creates only one instance - Lazy initialization
public enum EnumSingleton {
    INSTANCE;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
