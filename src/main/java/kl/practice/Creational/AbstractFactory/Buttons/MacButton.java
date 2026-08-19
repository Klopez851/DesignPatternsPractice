package kl.practice.Creational.AbstractFactory.Buttons;

import kl.practice.Creational.AbstractFactory.SupportingInterfaces.RetinaRenderingSupport;

public class MacButton implements Button, RetinaRenderingSupport {
    @Override
    public void render() {
        System.out.println("rendering mac button");
    }

    @Override
    public void onClick() {
        System.out.println("clicking mac button");
    }

    @Override
    public void setText(String text) {
        System.out.println("setting text to: "+text);
    }

    @Override
    public void supportsRetinaRendering() {
        System.out.println("I support retina rendering");
    }
}
