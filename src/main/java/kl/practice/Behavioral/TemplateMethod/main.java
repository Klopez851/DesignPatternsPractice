package kl.practice.Behavioral.TemplateMethod;
/*
============================================================
TEMPLATE METHOD DESIGN PATTERN — EXERCISE 1
============================================================

SCENARIO:

You're building a system that processes different types of
documents.

Every document follows the same general process:

    1. Open the document
    2. Read the document
    3. Process the document
    4. Close the document


However, the details of reading and processing depend on the
type of document.

For example:

    PDF
    CSV
    XML


YOUR TASK:

Implement the Template Method pattern from scratch.

Create an abstract class:

    DocumentProcessor

It should define a method such as:

    processDocument()

This method should define the overall algorithm:

    openDocument();
    readDocument();
    processData();
    closeDocument();


The important part:

    processDocument()

should define the ORDER of operations.

Subclasses should provide the implementation for the steps
that vary.


Create:

    PdfProcessor
    CsvProcessor
    XmlProcessor


Each subclass should implement the appropriate steps.


For example:

    PdfProcessor

might implement:

    openDocument()
    readDocument()
    processData()
    closeDocument()


while:

    CsvProcessor

does the same overall process but with different
implementations.


EXPECTED USAGE:

    DocumentProcessor pdf = new PdfProcessor();

    pdf.processDocument();


    DocumentProcessor csv = new CsvProcessor();

    csv.processDocument();


The client should NOT manually do:

    pdf.openDocument();
    pdf.readDocument();
    pdf.processData();
    pdf.closeDocument();


Instead, the client should simply call:

    processDocument();


The Template Method controls the algorithm.


The basic structure should look like:

                 DocumentProcessor
                        |
                        |
               processDocument()
                        |
          +-------------+-------------+
          |             |             |
          v             v             v
        PDF           CSV           XML


IMPORTANT:

The base class should control the order.

For example:

    processDocument() {

        openDocument();
        readDocument();
        processData();
        closeDocument();
    }


A subclass should NOT be able to accidentally change the
overall order of operations.


QUESTIONS TO THINK ABOUT WHILE IMPLEMENTING:

1. What is the Template Method?

2. Which class contains the Template Method?

3. Why should processDocument() be defined in the parent
   class?

4. Which steps are common to every document processor?

5. Which steps vary between subclasses?

6. Should subclasses be allowed to override
   processDocument()?

7. What would happen if PdfProcessor changed the order to:

       readDocument();
       openDocument();
       closeDocument();
       processData();

8. Why is controlling the algorithm's structure useful?

9. What happens if you add:

       JsonProcessor

   Does the existing code need to change?

10. What does the Template Method pattern accomplish that
    simply putting four methods in an interface doesn't?


============================================================
FOLLOW-UP EXERCISE 2 — HOOK METHODS
============================================================

Now extend your document processing system.

Suppose some document types need additional validation
before processing, while others don't.

Add a method to the base class:

    validateDocument()


But instead of making it abstract, give it a default
implementation.

For example:

    protected void validateDocument() {
        // Default: do nothing
    }


Now change your template:

    processDocument() {

        openDocument();

        validateDocument();

        readDocument();

        processData();

        closeDocument();
    }


This is called a HOOK METHOD.

A subclass can override it when it needs additional behavior,
but it doesn't have to.


YOUR TASK:

Make:

    PdfProcessor

perform validation before processing.

For example:

    "Validating PDF..."


But:

    CsvProcessor

doesn't need any special validation.


So:

    PDF
      -> open
      -> validate
      -> read
      -> process
      -> close


while:

    CSV
      -> open
      -> validate (default/no-op)
      -> read
      -> process
      -> close


CONSTRAINTS:

1. The order of operations must remain controlled by the
   parent class.

2. Subclasses should only customize the steps that actually
   vary.

3. Do NOT override processDocument() in the subclasses.

4. The base class should provide sensible defaults where
   appropriate.


BONUS:

Add another hook:

    shouldLog()

The template could do:

    if (shouldLog()) {
        logProcessing();
    }


By default:

    shouldLog() -> true


But allow a subclass to return:

    false


Now think about the difference between:

    ABSTRACT METHOD

and:

    HOOK METHOD


EXTRA BONUS:

Add a new processor:

    SecurePdfProcessor

It should:

    - open the document
    - validate it
    - authenticate it
    - read it
    - process it
    - close it

Think about whether "authenticate" belongs as another
hook in the base class assuming authentication is a required step in the processing algorithm

Ask yourself:

    "Which steps are fundamental to ALL document processing,
     and which steps are optional?"


============================================================
FINAL REFLECTION
============================================================

After finishing both exercises, answer these in your own words:

1. What problem does the Template Method pattern solve?

2. What is the Template Method?

3. Why does the base class control the algorithm?

4. What is a hook method?

5. What's the difference between an abstract method and
   a hook method?

6. Why shouldn't subclasses override the Template Method?

7. What happens when you add a new document type?

8. What are the advantages of Template Method?

9. What are the disadvantages?

10. What role does inheritance play in Template Method?

11. How is Template Method different from Strategy?

12. Strategy also allows different implementations of an
    algorithm. So when would you choose:

        Template Method

    versus:

        Strategy

13. What happens if the base class keeps accumulating
    more and more hooks?

14. Could the Template Method pattern become difficult to
    maintain if there are too many optional steps?

15. Where might you see Template Method in real software?

    Think about:

        - Data processing pipelines
        - Build systems
        - Test frameworks
        - Web request processing
        - Database operations
        - File processing
        - Framework lifecycle methods

16. Give one example where Template Method makes sense.

17. Give one example where using Template Method would
    probably be unnecessary complexity.


============================================================
*/
public class main {

    public static void main(String[] args) {
        DocumentProcessor pdfProcessor = new PdfProcessor();
        DocumentProcessor csvProcessor = new CsvProcessor();
        DocumentProcessor xmlProcessor = new XmlProcessor();
        DocumentProcessor securePdfProcessor = new SecurePdfProcessor();

        pdfProcessor.processDocument();
        csvProcessor.processDocument();
        xmlProcessor.processDocument();
        securePdfProcessor.processDocument();
    }
}
