package design.principles.dependencyinjection;

// Definition: High-level modules should not depend on low-level modules.
// Both should depend on abstractions. Abstractions should not depend on details.
// Details should depend on abstractions.

public class MainApp {
    public static void main(String[] args) {
        Switchable lightBulb = new LightBulb();
        Switch switch1=new Switch(lightBulb);
        switch1.operate();
    }
}
