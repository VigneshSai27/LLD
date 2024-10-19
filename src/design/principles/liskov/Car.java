package design.principles.liskov;

public class Car implements EngineVehicle{
    @Override
    public void engineType(String type) {
        System.out.println("Car engine type is: "+type);
    }
}
