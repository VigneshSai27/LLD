package com.design.patterns.creational.singleton;

// Lazy initialization. However, due to synchronized it causes overhead
// (Many threads waits at getInstance method though the object is already created)
public class Human {
    private Human instance;

    public synchronized Human getInstance() {
        if (instance == null) {
            instance = new Human();
        }
        return instance;
    }
}
