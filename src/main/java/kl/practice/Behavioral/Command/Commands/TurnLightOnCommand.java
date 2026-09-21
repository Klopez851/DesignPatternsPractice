package kl.practice.Behavioral.Command.Commands;

import kl.practice.Behavioral.Command.Light;

public class TurnLightOnCommand implements Command {
    private Light lights;

    public TurnLightOnCommand(Light lights){
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.turnOn();
    }

    @Override
    public void undo() {
        lights.turnOff();
    }
}
