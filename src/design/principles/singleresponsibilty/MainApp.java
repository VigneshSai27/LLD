package design.principles.singleresponsibilty;

//Definition: A class should have only one reason to change,
// meaning it should have only one job or responsibility.

public class MainApp {
    public static void main(String[] args) {
        SaveToFile saveToFile=new SaveToFile();
        SaveToDB saveToDB=new SaveToDB();
        saveToFile.saveToFile();
        saveToDB.saveToDB();
    }
}
