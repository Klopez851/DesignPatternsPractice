package kl.practice.Structural.Facade;

import lombok.NoArgsConstructor;

@NoArgsConstructor
// chatgpt generated since this isnt the main point of the exercise
public class DVDPlayer {

    public void on() {
        System.out.println("DVD Player is ON");
    }

    public void play(String movie) {
        System.out.println("DVD is playing "+movie);
    }

    public void stop() {
        System.out.println("DVD stopped");
    }

    public void off() {
        System.out.println("DVD Player is OFF");
    }
}

