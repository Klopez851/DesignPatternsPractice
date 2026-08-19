package kl.practice.Creational.AbstractFactory.Checkboxes;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void render() {
        System.out.println("rendering windows checkbox");
    }

    @Override
    public void setChecked(boolean status) {
        System.out.println("windows checked status = "+status);
    }
}
