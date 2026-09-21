package kl.practice.Behavioral.Command.Commands;

import kl.practice.Behavioral.Command.GarageDoor;

public class OpenGarageDoorCommand implements Command{
    private GarageDoor garageDoor;

    public OpenGarageDoorCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.open();
    }

    @Override
    public void undo() {
        garageDoor.close();
    }
}
