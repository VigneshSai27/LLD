package design.principles.interfacesegmentation;

//Definition: Clients should not be forced to depend on interfaces they do not use.

public class MainApp {
    public static void main(String[] args) {
        Printer printer=() -> System.out.println("Printing Document");
        Scanner scanner=() -> System.out.println("Scanning Document");
        Fax fax=() -> System.out.println("Fax Document");
        printer.printDocument();
        scanner.scanDocument();
        fax.faxDocument();
    }
}
