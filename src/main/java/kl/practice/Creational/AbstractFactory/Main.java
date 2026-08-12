package kl.practice.Creational.AbstractFactory;

/*
 * ABSTRACT FACTORY EXERCISE: Cross-Platform UI
 *
 * You are building an application that supports multiple operating systems.
 *
 * Your UI contains several types of components:
 *
 *     Button
 *     Checkbox
 *     TextField
 *
 * Each operating system has its own implementation:
 *
 *     WindowsButton
 *     WindowsCheckbox
 *     WindowsTextField
 *
 *     MacButton
 *     MacCheckbox
 *     MacTextField
 *
 *
 * ============================================================
 * GOAL
 * ============================================================
 *
 * The rest of the application should NOT need to know whether
 * it is using Windows or Mac components.
 *
 * The application should be able to do something like:
 *
 *     UIFactory factory = ...;
 *
 *     Button button = factory.createButton();
 *     Checkbox checkbox = factory.createCheckbox();
 *     TextField textField = factory.createTextField();
 *
 *
 * ============================================================
 * REQUIREMENTS
 * ============================================================
 *
 * 1. Create interfaces for:
 *
 *        Button
 *        Checkbox
 *        TextField
 *
 *
 * 2. Create Windows implementations of each:
 *
 *        WindowsButton
 *        WindowsCheckbox
 *        WindowsTextField
 *
 *
 * 3. Create Mac implementations of each:
 *
 *        MacButton
 *        MacCheckbox
 *        MacTextField
 *
 *
 * 4. Create a UIFactory interface that can create:
 *
 *        Button
 *        Checkbox
 *        TextField
 *
 *
 * 5. Create:
 *
 *        WindowsFactory
 *        MacFactory
 *
 *    Each factory should create ONLY components belonging to
 *    its own operating-system family.
 *
 *
 * ============================================================
 * IMPORTANT DESIGN REQUIREMENT
 * ============================================================
 *
 * Imagine the application has this:
 *
 *        WindowsFactory
 *             |
 *       +-----+-----+
 *       |     |     |
 *    Button Checkbox TextField
 *
 * Every component produced by that factory should belong to
 * the Windows family.
 *
 * The same should be true for MacFactory.
 *
 *
 * ============================================================
 * CHALLENGE
 * ============================================================
 *
 * Write a UIManager class that uses ONLY UIFactory and the
 * product interfaces.
 *
 * UIManager should NOT contain:
 *
 *        new WindowsButton()
 *        new MacButton()
 *        new WindowsCheckbox()
 *        new MacCheckbox()
 *        etc.
 *
 * It should only know about:
 *
 *        UIFactory
 *        Button
 *        Checkbox
 *        TextField
 *
 *
 * ============================================================
 * FINAL TEST
 * ============================================================
 *
 * Your main method should be able to switch the entire UI
 * between Windows and Mac by changing the factory:
 *
 *        UIFactory factory = new WindowsFactory();
 *
 *        // create/use UI
 *
 *        factory = new MacFactory();
 *
 *        // create/use UI
 *
 * WITHOUT changing UIManager.
 *
 *
 * ============================================================
 * AFTER IMPLEMENTING
 * ============================================================
 *
 * Answer these questions:
 *
 * 1. Why isn't UIFactory simply a factory for one object?
 *
 * 2. What makes Button, Checkbox, and TextField a "family"?
 *
 * 3. What would go wrong if UIManager directly instantiated
 *    WindowsButton and MacCheckbox?
 *
 * 4. What does changing the factory accomplish?
 *
 * 5. What does Abstract Factory give you that having three
 *    separate factories (ButtonFactory, CheckboxFactory,
 *    TextFieldFactory) would not?
 */

/*
 * ABSTRACT FACTORY FOLLOW-UP
 *
 * Your application now supports:
 *
 *     Windows
 *     Mac
 *     Linux
 *
 * But there is a new requirement:
 *
 * Some UI components have different capabilities depending on
 * the platform.
 *
 * For example:
 *
 *     WindowsButton
 *         supportsWindowsAnimations()
 *
 *     MacButton
 *         supportsRetinaRendering()
 *
 *     LinuxButton
 *         supportsWayland()
 *
 *
 * ============================================================
 * CHALLENGE 1
 * ============================================================
 *
 * Add LinuxFactory and the Linux product implementations.
 *
 * The existing UIManager should require NO changes.
 *
 *
 * ============================================================
 * CHALLENGE 2
 * ============================================================
 *
 * Add a new product type:
 *
 *     Menu
 *
 * with:
 *
 *     WindowsMenu
 *     MacMenu
 *     LinuxMenu
 *
 * Update the abstract factory and concrete factories.
 *
 * Ask yourself:
 *
 *     "How many places had to change when I added a new
 *      PRODUCT TYPE?"
 *
 *
 * ============================================================
 * CHALLENGE 3
 * ============================================================
 *
 * Now imagine the opposite change:
 *
 * You add a completely new platform:
 *
 *     Android
 *
 * Ask yourself:
 *
 *     "How many classes do I need to add?"
 *
 * and compare that to adding a new PRODUCT TYPE.
 *
 *
 * ============================================================
 * CHALLENGE 4 — IMPORTANT
 * ============================================================
 *
 * Think about this tradeoff:
 *
 * Abstract Factory makes it easy to add a NEW PRODUCT FAMILY
 * (e.g. Linux).
 *
 * But adding a NEW PRODUCT TYPE (e.g. Menu) requires modifying
 * the factory interface and every concrete factory.
 *
 * Explain why this tradeoff exists.
 *
 *
 * ============================================================
 * FINAL QUESTION
 * ============================================================
 *
 * In your own words:
 *
 * Why is Abstract Factory not simply "a factory that creates
 * multiple objects"?
 *
 * What relationship between those objects is the pattern
 * actually trying to preserve?
 */

public class Main {
}
