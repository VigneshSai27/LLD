package without.design.principles.liskov;

public class Bicycle implements Vehicle{
    @Override
    public void engineType(String type) {
        throw new RuntimeException("Bicycle will not have engine");
    }
}
