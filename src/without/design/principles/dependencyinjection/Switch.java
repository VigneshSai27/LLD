package without.design.principles.dependencyinjection;

public class Switch {
    private LightBulb lightBulb;

    public Switch(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    public void operate() {
        lightBulb.turnOn();
    }
}
