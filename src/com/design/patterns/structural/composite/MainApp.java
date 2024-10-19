package com.design.patterns.structural.composite;

// Any problem statement is in tree form, then Composite pattern can be used
// Ex: Forming directories inside directories and at last adding the file.

public class MainApp {
    public static void main(String[] args) {
        Directory lldDirectory = new Directory("lldDirectory");
        Directory design = new Directory("design");
        Directory pattern = new Directory("pattern");
        File file = new File("CompositePattern");
        lldDirectory.addDirectory(design);
        design.addDirectory(pattern);
        pattern.addDirectory(file);
        lldDirectory.ls();



        // Testing
        Folder pattern1 = new Folder(file);
        pattern1.ls();
        Directory design1 = new Directory("design");
        Directory lldDirectory1 = new Directory("lldDirectory");

    }
}
