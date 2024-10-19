package com.design.patterns.creational.singleton;

// Lazy initialization. Also, due to double check only few thread will enter synchronized
// at the start and the rest of threads will not wait at synchronized. Improved performance

public class Fish {
    private volatile Fish instance;

    public Fish getInstance() {
        if (instance == null) {
            synchronized (Fish.class) {
                if (instance == null) {
                    instance = new Fish();
                }
            }
        }
        return instance;
    }
}
