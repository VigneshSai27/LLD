package without.design.principles.singleresponsibilty;

public class Save {
    void saveToFile() {
        System.out.println("Saving to file");
    }
    void saveToDB() {
        System.out.println("Saving to DB");
    }

}
