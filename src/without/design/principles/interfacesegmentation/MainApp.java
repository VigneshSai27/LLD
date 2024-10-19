package without.design.principles.interfacesegmentation;

public class MainApp {
    public static void main(String[] args) {
        Printer printer = new PrinterImpl();
        printer.printDocument();
        printer.scanDocument();
        printer.faxDocument();
    }
}
