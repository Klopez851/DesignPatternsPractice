package kl.practice.Creational.AbstractFactory.TextFields;

public class MacTextfield implements Textfield{
    @Override
    public void render() {
        System.out.println("rendering mack textfield");
    }

    @Override
    public void setText(String text) {
        System.out.println("setting mac textfield text to: "+text);
    }

    @Override
    public void setSize(int width, int height) {
        System.out.printf("setting  mac textfield size to width %d, height: %d", width,height);
    }
}
