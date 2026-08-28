package kl.practice.Structural.Facade;

import lombok.NoArgsConstructor;

@NoArgsConstructor
// chatgpt generated since this isnt the main point of the exercise
public class Amplifier {

    public void on() {
        System.out.println("Amplifier is ON");
    }

    public void setVolume(int volume) {
        System.out.println("Amplifier volume set to " + volume);
    }

    public void off() {
        System.out.println("Amplifier is OFF");

    }
}

