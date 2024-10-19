package design.principles.liskov;

// Definition: Subtypes must be substitutable for their base types
// without altering the correctness of the program.

public class MainApp {
    public static void main(String[] args) {
        EngineVehicle car = new Car();
        NormalVehicle bicycle = new Bicycle();

        car.engineType("ABC");
        // bicycle.engineType("ABC"); // It throws compiler, which is better than runtime error.
    }
}
