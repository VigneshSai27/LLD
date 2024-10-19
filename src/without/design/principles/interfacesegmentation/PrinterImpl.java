package without.design.principles.interfacesegmentation;

public class PrinterImpl implements Printer{
    @Override
    public void printDocument() {
        System.out.println("Print Document");
    }

    @Override
    public void scanDocument() {
        System.out.println("Scan Document");
    }

    @Override
    public void faxDocument() {
        System.out.println("Fax Document");
    }
}
