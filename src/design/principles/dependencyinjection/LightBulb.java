package design.principles.dependencyinjection;

public class LightBulb implements Switchable{
    @Override
    public void turnOn() {
        System.out.println("Switch off light");
    }

    @Override
    public void turnOff() {
        System.out.println("Switch on light");
    }
}
