package design.principles.dependencyinjection;

public class Switch {
    private Switchable switchable;

    public Switch(Switchable switchable) {
        this.switchable = switchable;
    }

    public void operate() {
        switchable.turnOn();
    }
}
