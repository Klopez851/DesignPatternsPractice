package kl.practice.Creational.AbstractFactory.Menus;

public class WindowsMenu implements Menu{
    @Override
    public void render() {
        System.out.println("Rendering Windows menu");
    }

    @Override
    public void setOptions(String options) {
        System.out.println("Setting windows menu options to: "+options);
    }
}
