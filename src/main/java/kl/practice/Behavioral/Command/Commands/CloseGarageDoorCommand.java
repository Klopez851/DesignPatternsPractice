package kl.practice.Behavioral.Command.Commands;

import kl.practice.Behavioral.Command.GarageDoor;

public class CloseGarageDoorCommand implements Command{
    private GarageDoor garageDoor;

    public CloseGarageDoorCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.close();
    }

    @Override
    public void undo() {
        garageDoor.open();
    }
}
