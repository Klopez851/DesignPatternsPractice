package kl.practice.Creational.AbstractFactory.UIFactories;

import kl.practice.Creational.AbstractFactory.Buttons.Button;
import kl.practice.Creational.AbstractFactory.Buttons.LinuxButton;
import kl.practice.Creational.AbstractFactory.Checkboxes.Checkbox;
import kl.practice.Creational.AbstractFactory.Checkboxes.LinuxCheckbox;
import kl.practice.Creational.AbstractFactory.Menus.LinuxMenu;
import kl.practice.Creational.AbstractFactory.Menus.Menu;
import kl.practice.Creational.AbstractFactory.TextFields.LinuxTextfield;
import kl.practice.Creational.AbstractFactory.TextFields.Textfield;

public class LinuxUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }

    @Override
    public Textfield createTextfield() {
        return new LinuxTextfield();
    }

    @Override
    public Menu createMenu() {
        return new LinuxMenu();
    }
}
