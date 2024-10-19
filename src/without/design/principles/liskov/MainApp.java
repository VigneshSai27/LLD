package without.design.principles.liskov;

public class MainApp {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();

        car.engineType("ABC");
        bicycle.engineType("ABC");

    }
}
