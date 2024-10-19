package com.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

    private String directoryName;
    private List<FileSystem> directories;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        this.directories = new ArrayList<>();
    }

    public void addDirectory(FileSystem directory) {
        directories.add(directory);
    }

    @Override
    public void ls() {
        for (FileSystem dir : directories) {
            System.out.println("Directory Name: "+name());
            dir.ls();
        }
    }

    @Override
    public String name() {
        return directoryName;
    }
}
