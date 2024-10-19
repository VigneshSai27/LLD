package com.design.patterns.structural.composite;

public class File implements FileSystem {
    String filename;

    public File(String name) {
        this.filename = name;
    }

    @Override
    public void ls() {
        System.out.println("File Name: " + name());
    }

    @Override
    public String name() {
        return filename;
    }
}
