package kl.practice.Creational.AbstractFactory.TextFields;

public class LinuxTextfield implements Textfield{
    @Override
    public void render() {
        System.out.println("rendering linux textfield");
    }

    @Override
    public void setText(String text) {
        System.out.println("setting linux textfield to: "+text);
    }

    @Override
    public void setSize(int width, int height) {
        System.out.printf("settiing linux textfield size to width: %d, height: %d", width,height);
    }
}
