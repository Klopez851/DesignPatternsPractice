package kl.practice.Creational.AbstractFactory.Checkboxes;

public class LinuxCheckbox implements Checkbox{
    @Override
    public void render() {
        System.out.println("rendering linux checkbox");
    }

    @Override
    public void setChecked(boolean status) {
        System.out.println("linuc checkbox ststus: "+status);
    }
}
