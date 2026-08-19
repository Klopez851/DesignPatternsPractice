package kl.practice.Creational.AbstractFactory.Buttons;

import kl.practice.Creational.AbstractFactory.SupportingInterfaces.WaylandSupport;

public class LinuxButton implements Button, WaylandSupport {
    @Override
    public void render() {
        System.out.println("rendering linux button");
    }

    @Override
    public void onClick() {
        System.out.println("clicking linux button");
    }

    @Override
    public void setText(String text) {
        System.out.println("setting linux button text to: "+text);
    }

    @Override
    public void supportsWayland() {
        System.out.println("I support Wayland");
    }
}
