package kl.practice.Creational.AbstractFactory.Menus;

public class MacMenu implements Menu{
    @Override
    public void render() {
        System.out.println("rendering mac menu");
    }

    @Override
    public void setOptions(String options) {
        System.out.println("setting mac menu options to: "+options);
    }
}
