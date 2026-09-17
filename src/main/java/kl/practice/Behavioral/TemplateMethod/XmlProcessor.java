package kl.practice.Behavioral.TemplateMethod;

public class XmlProcessor extends DocumentProcessor{

    public XmlProcessor(){}

    @Override
    protected void authenticateDocument() {
        System.out.println("Authenticating XML");
    }

    @Override
    protected void openDocument() {
        System.out.println("Opening XML");
    }

    @Override
    protected void readDocument() {
        System.out.println("Reading XML");
    }

    @Override
    protected void processData() {
        System.out.println("Processing XML");
    }

    @Override
    protected void closeDocument() {
        System.out.println("Closing XML");
    }
}
