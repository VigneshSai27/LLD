package without.design.principles.liskov;

public class Car implements Vehicle{
    @Override
    public void engineType(String type) {
        System.out.println("Car engine type is: "+type);
    }
}
