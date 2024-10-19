package without.design.principles.dependencyinjection;

public class MainApp {
    public static void main(String[] args) {
        LightBulb lightBulb=new LightBulb();
        Switch switchButton = new Switch(lightBulb);
        switchButton.operate();
    }
}
