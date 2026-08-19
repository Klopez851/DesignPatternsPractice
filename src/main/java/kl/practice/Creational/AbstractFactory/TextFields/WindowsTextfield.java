package kl.practice.Creational.AbstractFactory.TextFields;

public class WindowsTextfield implements Textfield{
    @Override
    public void render() {
        System.out.println("rendering windows textfield");
    }

    @Override
    public void setText(String text) {
        System.out.println("rsetting widows textfield text to: "+text);
    }

    @Override
    public void setSize(int width, int height) {
        System.out.printf("setting windows textfield size to width %d, height: %d", width,height);
    }
}
