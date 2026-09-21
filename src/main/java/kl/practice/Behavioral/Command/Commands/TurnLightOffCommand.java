package kl.practice.Behavioral.Command.Commands;

import kl.practice.Behavioral.Command.Light;

public class TurnLightOffCommand implements Command{
    private Light lights;

    public TurnLightOffCommand(Light lights){
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.turnOff();
    }

    @Override
    public void undo() {
        lights.turnOn();
    }
}
