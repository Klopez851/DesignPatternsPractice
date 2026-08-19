package kl.practice.Creational.AbstractFactory.UIFactories;

import kl.practice.Creational.AbstractFactory.Buttons.Button;
import kl.practice.Creational.AbstractFactory.Buttons.MacButton;
import kl.practice.Creational.AbstractFactory.Checkboxes.Checkbox;
import kl.practice.Creational.AbstractFactory.Checkboxes.MacCheckbox;
import kl.practice.Creational.AbstractFactory.Menus.MacMenu;
import kl.practice.Creational.AbstractFactory.Menus.Menu;
import kl.practice.Creational.AbstractFactory.TextFields.MacTextfield;
import kl.practice.Creational.AbstractFactory.TextFields.Textfield;

public class MacUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }

    @Override
    public Textfield createTextfield() {
        return new MacTextfield();
    }

    @Override
    public Menu createMenu() {
        return new MacMenu();
    }
}
