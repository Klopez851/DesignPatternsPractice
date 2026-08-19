package kl.practice.Creational.AbstractFactory.UIFactories;

import kl.practice.Creational.AbstractFactory.Buttons.Button;
import kl.practice.Creational.AbstractFactory.Checkboxes.Checkbox;
import kl.practice.Creational.AbstractFactory.Menus.Menu;
import kl.practice.Creational.AbstractFactory.TextFields.Textfield;

public interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();
    Textfield createTextfield();
    Menu createMenu();
}
