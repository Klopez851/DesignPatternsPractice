package kl.practice.Creational.AbstractFactory;

import kl.practice.Creational.AbstractFactory.Buttons.Button;
import kl.practice.Creational.AbstractFactory.Checkboxes.Checkbox;
import kl.practice.Creational.AbstractFactory.Menus.Menu;
import kl.practice.Creational.AbstractFactory.TextFields.Textfield;
import kl.practice.Creational.AbstractFactory.UIFactories.UIFactory;

public class UIManager {
    private UIFactory factory;

    public UIManager(UIFactory factory){
        this.factory=factory;
    }

    public void createUI(){
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();
        Textfield textfield = factory.createTextfield();
        Menu menu = factory.createMenu();

        button.render();
        checkbox.render();
        textfield.render();
        menu.render();
    }

    public void setFactory(UIFactory factory){
        this.factory = factory;
    }
}
