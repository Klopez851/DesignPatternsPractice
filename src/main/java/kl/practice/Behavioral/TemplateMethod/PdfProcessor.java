package kl.practice.Behavioral.TemplateMethod;

public class PdfProcessor extends DocumentProcessor{

    public PdfProcessor(){}

    @Override
    protected void authenticateDocument() {
        System.out.println("Authenticating PDF ");
    }

    @Override
    protected void openDocument() {
        System.out.println("Opening PDF");
    }

    @Override
    protected void readDocument() {
        System.out.println("Reading PDF");
    }

    @Override
    protected void processData() {
        System.out.println("Processing PDF");
    }

    @Override
    protected void closeDocument() {
        System.out.println("Closing PDF");
    }

    protected void validateDocument(){
        System.out.println("Validation in PDF class");
    }
}
