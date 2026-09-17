package kl.practice.Behavioral.TemplateMethod;

public class SecurePdfProcessor extends DocumentProcessor{

    public SecurePdfProcessor(){}

    @Override
    protected boolean shouldLog() {
        return false;
    }

    @Override
    protected void openDocument() {
        System.out.println("Opening Secure PDF");
    }

    @Override
    protected void authenticateDocument() {
        System.out.println("Authenticating Secure PDF");
    }

    @Override
    protected void readDocument() {
        System.out.println("Reading Secure PDF");
    }

    @Override
    protected void processData() {
        System.out.println("Processing Secure PDF");
    }

    @Override
    protected void closeDocument() {
        System.out.println("Closing Secure PDF");
    }
}
