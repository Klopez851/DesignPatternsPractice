package kl.practice.Structural.Facade;

/*
 * ============================================================
 * 5. FACADE — Home Theater
 * ============================================================
 *
 * INITIAL EXERCISE
 *
 * You have these subsystem classes:
 *
 *     Projector
 *     Amplifier
 *     DVDPlayer
 *     Lights
 *     Screen
 *
 * Watching a movie requires multiple operations:
 *
 *     projector.on();
 *     projector.setInput("DVD");
 *     amplifier.on();
 *     amplifier.setVolume(20);
 *     screen.down();
 *     lights.changeBrightness(10);
 *     dvdPlayer.on();
 *     dvdPlayer.play();
 *
 * Create:
 *
 *     HomeTheaterFacade
 *
 * with:
 *
 *     watchMovie(String movie)
 *     endMovie()
 *
 * The client should not need to know the correct sequence of
 * subsystem operations.
 *
 *
 * FOLLOW-UP
 *
 * Add another common workflow:
 *
 *     listenToMusic(String album)
 *
 * This should configure the subsystem appropriately for music.
 *
 * The client should be able to do:
 *
 *     theater.watchMovie("The Matrix");
 *     theater.endMovie();
 *
 *     theater.listenToMusic("Abbey Road");
 *
 * WITHOUT directly interacting with Projector, Amplifier,
 * DVDPlayer, Lights, or Screen.
 *
 * Then ask:
 *
 *     At what point would this Facade become too large?
 *
 *     Would you create additional Facades?
 *
 *     Or would you redesign the subsystem?
 *
 * ============================================================
 */

public class main {

    public static void main(String[] args) {
        HomeTheaterFacade facade =new HomeTheaterFacade();

        facade.watchMovie("Wall-E");
        System.out.println("==============================================================================");
        facade.endMovie();
    }
}
