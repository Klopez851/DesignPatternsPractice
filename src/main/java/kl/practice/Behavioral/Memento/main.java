/*
============================================================
MEMENTO DESIGN PATTERN — EXERCISE 1
============================================================

SCENARIO:

You're building a simple text editor.

A user can modify a document:

    "Hello"
    "Hello World"
    "Hello World!"

You want to give the user the ability to save the current
state of the document and later restore it.

For example:

    Document document = new Document();

    document.setText("Hello");

    // Save this state

    document.setText("Hello World");

    // Restore the previous state

    // Document should now contain "Hello"


YOUR TASK:

Implement the Memento design pattern from scratch.

Create:

    1. Document

       This is the object whose state we want to save.

       Give it:

           text

       and methods such as:

           setText(...)
           getText(...)

           save()
           restore(...)


    2. DocumentMemento

       This object should represent a saved snapshot of the
       Document's state.

       It should contain whatever information is necessary
       to restore the Document.


    3. History

       This object should keep track of saved Mementos.

       Give it methods such as:

           save(...)
           undo()


A possible relationship:

                 Document
                    |
                    | creates
                    v
              DocumentMemento
                    ^
                    |
                  stores
                    |
                 History


EXPECTED USAGE:

    Document document = new Document();
    History history = new History();

    document.setText("Hello");

    history.save(document.save());

    document.setText("Hello World");

    history.save(document.save());

    document.setText("Hello World!");

    document.restore(history.undo());


After the final restore, the document should contain:

    "Hello World"


IMPORTANT:

The History class should NOT need to know the internal
details of Document.

It should simply store Mementos.

Similarly, the client should not need to manually create
a Memento containing:

    document.getText()
    document.getSomethingElse()
    document.getAnotherField()


The Document should be responsible for creating its own
snapshot.


QUESTIONS TO THINK ABOUT WHILE IMPLEMENTING:

1. What exactly is the "state" of the Document?

2. Who creates the Memento?

3. Who stores the Memento?

4. Who is allowed to use the Memento to restore state?

5. Should History be able to modify the contents of a
   Memento?

6. Why shouldn't History simply store Document objects?

7. What would happen if History stored references to the
   actual Document instead of snapshots?

8. What does the Memento allow you to hide?

9. Why is it useful for the Document to control how its
   state is saved?

10. What happens if you create a Memento and then modify
    the Document?


============================================================
FOLLOW-UP EXERCISE 2 — MULTIPLE LEVELS OF UNDO
============================================================

Now turn your text editor into a real undo system.

Instead of only being able to restore one previous state,
the user should be able to undo multiple changes.

For example:

    State 1:
        "Hello"

    State 2:
        "Hello World"

    State 3:
        "Hello World!"

    State 4:
        "Hello World! How are you?"


The user should be able to do:

    undo()
    undo()
    undo()


And get:

    "Hello World!"

    "Hello World"

    "Hello"


YOUR TASK:

Modify History so that it can store multiple Mementos.

Think about which data structure would naturally represent
a history of states.

Your client should be able to do something like:

    document.setText("Hello");
    history.save(document.save());

    document.setText("Hello World");
    history.save(document.save());

    document.setText("Hello World!");
    history.save(document.save());

    document.restore(history.undo());

    document.restore(history.undo());


The Document should not need to know how many previous
versions exist.

History should manage that.


CONSTRAINTS:

1. Do NOT put a List of previous states inside Document.

2. Do NOT make the client responsible for managing previous
   versions.

3. History should only deal with Mementos.

4. Document should remain responsible for creating and
   restoring its own state.

5. The internal state of Document should remain encapsulated.


BONUS:

Add a redo feature.

Now you should be able to:

    undo()
    redo()


Example:

    State 1 -> "Hello"
    State 2 -> "Hello World"
    State 3 -> "Hello World!"

    undo()
        -> "Hello World"

    undo()
        -> "Hello"

    redo()
        -> "Hello World"

    redo()
        -> "Hello World!"


Think carefully about how you would represent:

    undo history
    redo history


What should happen to the redo history if the user makes
a NEW change after undoing?

For example:

    State 1 -> A
    State 2 -> B
    State 3 -> C

    undo()
        -> B

    undo()
        -> A

    make a new change
        -> D

What should happen if the user now calls redo()?


============================================================
FINAL REFLECTION
============================================================

After finishing both exercises, answer these in your own words:

1. What problem does the Memento pattern solve?

2. What is the Memento?

3. What is the Originator?

4. What is the Caretaker?

5. In this exercise, which class is the Originator?

6. Which class is the Caretaker?

7. Why doesn't History need to know the internal state of
   Document?

8. Why is storing snapshots safer than storing references
   to the original object?

9. What does Memento help you preserve?

10. What are the disadvantages of keeping many snapshots?

11. How would memory usage change if Document contained
    thousands of lines of text?

12. Where might you see the Memento pattern in real software?

    Think about:

        - Undo/redo
        - Save points
        - Transaction rollback
        - Game checkpoints
        - Editor history

13. How is Memento different from Command?

14. Could Command and Memento be used together to implement
    a robust undo/redo system?

15. Give one situation where Memento would be useful and one
    situation where it would be unnecessary complexity.


============================================================
*/
package kl.practice.Behavioral.Memento;

public class main {
}
