package kl.practice.Behavioral.TemplateMethod;

public abstract class DocumentProcessor {

    public DocumentProcessor(){}
    public void processDocument(){
        openDocument();
        authenticateDocument();
        validateDocument();
        readDocument();
        processData();
        closeDocument();
        if(shouldLog()){
            System.out.println("Document Logged");
        }
    }
    /// //////////// ///
    /// HOOK METHODS ///
    /// //////////// ///

    protected void validateDocument(){
        System.out.println("Base class validation");
    }

    protected boolean shouldLog(){
        return true;
    }

    /// //////////////// ///
    /// ABSTRACT METHODS ///
    /// //////////////// ///

    protected abstract void openDocument();
    protected abstract void authenticateDocument();
    protected abstract void readDocument();
    protected abstract void processData();
    protected abstract void closeDocument();
}
