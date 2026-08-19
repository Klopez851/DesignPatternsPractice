package kl.practice.Creational.AbstractFactory.Buttons;

import kl.practice.Creational.AbstractFactory.SupportingInterfaces.WindowsAnimation;

public class WindowsButton implements Button, WindowsAnimation {
    @Override
    public void render() {
        System.out.println("rendering windows button");
    }

    @Override
    public void onClick() {
        System.out.println("clicking windows button");
    }

    @Override
    public void setText(String text) {
        System.out.println("setting text to: "+text);

    }

    @Override
    public void supportsWindowsAnimation() {
        System.out.println("I support windows animations");
    }
}
