package kl.practice.Structural.Facade;

import lombok.NoArgsConstructor;

@NoArgsConstructor
//not making this an interface since it is unnecessary, there will only ever be one implementation of the facade,
// therefore making it a class works for this exercise
public class HomeTheaterFacade {
    private Projector projector = new Projector();
    private Amplifier amplifier = new Amplifier();
    private DVDPlayer dvdPlayer = new DVDPlayer();
    private Lights lights = new Lights();
    private Screen screen = new Screen();

    public void watchMovie(String movie){
        projector.on();
        projector.setInput("DVD");
        amplifier.on();
        amplifier.setVolume(20);
        screen.down();
        lights.changeBrightness(10);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie(){
        dvdPlayer.stop();
        dvdPlayer.off();
        lights.changeBrightness(30);
        screen.up();
        amplifier.off();
        projector.off();
    }
}
