package kl.practice.Structural.Proxy;

/*
 * ============================================================
 * 7. PROXY — Lazy Image Loading
 * ============================================================
 *
 * INITIAL EXERCISE
 *
 * Create:
 *
 *     interface Image {
 *         void display();
 *     }
 *
 * Create an expensive:
 *
 *     RealImage
 *
 * Constructing RealImage should simulate expensive loading:
 *
 *     Loading huge_image.jpg...
 *
 * Create an intermediary so that:
 *
 *     Image image = new ImageProxy("huge_image.jpg");
 *
 * does NOT immediately load the image.
 *
 * Only:
 *
 *     image.display();
 *
 * should cause RealImage to be created.
 *
 * Repeated calls to display() should NOT reload the image.
 *
 *
 * FOLLOW-UP
 *
 * Extend your proxy so that it also performs access control.
 *
 * Create something conceptually like:
 *
 *     Image image = new ImageProxy(
 *         "secret.jpg",
 *         currentUser
 *     );
 *
 * If the user isn't authorized:
 *
 *     image.display();
 *
 * should fail WITHOUT loading the real image.
 *
 * If authorized:
 *
 *     image.display();
 *
 * should load and display it normally.
 *
 * Then answer:
 *
 *     Why is this still a Proxy rather than a Decorator?
 *
 * ============================================================
 */

public class main {
}
