package kl.practice.Behavioral.TemplateMethod;

public class CsvProcessor extends DocumentProcessor{

    public CsvProcessor(){}

    @Override
    protected void authenticateDocument() { System.out.println("Authenticating CSV"); }

    @Override
    protected void openDocument() { System.out.println("Opening CVS"); }

    @Override
    protected void readDocument() {
        System.out.println("Reading CVS");
    }

    @Override
    protected void processData() {
        System.out.println("Processing CVS");
    }

    @Override
    protected void closeDocument() {
        System.out.println("Closing CVS");
    }
}
