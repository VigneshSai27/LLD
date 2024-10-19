package com.design.patterns.structural.composite;

public class Folder implements FileSystem{
    FileSystem fileSystem;

    public Folder(FileSystem fileSystem) {
        this.fileSystem = fileSystem;
    }

    @Override
    public void ls() {
        System.out.println(fileSystem.name());
        fileSystem.ls();
    }

    @Override
    public String name() {
        return null;
    }
}
