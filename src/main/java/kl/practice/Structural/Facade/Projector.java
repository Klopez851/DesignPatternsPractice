package kl.practice.Structural.Facade;

import lombok.NoArgsConstructor;

@NoArgsConstructor
// chatgpt generated since this isnt the main point of the exercise
public class Projector {

    public void on() {
        System.out.println("Projector is ON");
    }

    public void setInput(String input) {
        System.out.println("Projector input set to " + input);
    }

    public void off() {
        System.out.println("Projector is OFF");
    }
}

