package kl.practice.Creational.AbstractFactory.UIFactories;

import kl.practice.Creational.AbstractFactory.Buttons.Button;
import kl.practice.Creational.AbstractFactory.Buttons.WindowsButton;
import kl.practice.Creational.AbstractFactory.Checkboxes.Checkbox;
import kl.practice.Creational.AbstractFactory.Checkboxes.WindowsCheckbox;
import kl.practice.Creational.AbstractFactory.Menus.Menu;
import kl.practice.Creational.AbstractFactory.Menus.WindowsMenu;
import kl.practice.Creational.AbstractFactory.TextFields.Textfield;
import kl.practice.Creational.AbstractFactory.TextFields.WindowsTextfield;

public class WindowsUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }

    @Override
    public Textfield createTextfield() {
        return new WindowsTextfield();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }
}
