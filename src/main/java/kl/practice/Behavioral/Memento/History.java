package kl.practice.Behavioral.Memento;

import java.util.Stack;

public class History {
    private Stack<Document.Memento> undoHistory = new Stack<>();
    private Stack<Document.Memento> redoHistory = new Stack<>();

    public History(){}

    public void save(Document.Memento memento){
        undoHistory.push(memento);
    }

    public Document.Memento undo(){
        if(undoHistory.empty()){
            System.out.println("no undo's available");
            return null;
        }
        Document.Memento undo = undoHistory.pop();
        redoHistory.push(undo);

        return undo;
    }

    public Document.Memento redo(){
        if(redoHistory.empty()){
            System.out.println("no redo's available");
            return null;
        }
        return redoHistory.pop();
    }

}
