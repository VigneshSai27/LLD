package without.design.principles.singleresponsibilty;

// Without SOLID principles
public class MainApp {
    public static void main(String[] args) {
        Save save=new Save();
        save.saveToFile();
        save.saveToDB();
    }
}
