package kl.practice.Behavioral.Command;

import kl.practice.Behavioral.Command.Commands.Command;

public class RemoteControl {
    private Command command;

    public RemoteControl(){}

    public void setCommand(Command command){
        this.command=command;
    }

    public void pressButton(){
        command.execute();
    }

    public void pressUndo(){
        if(command == null){
            System.out.println("No command available to undo");
            return;
        }
        command.undo();
    }
}
