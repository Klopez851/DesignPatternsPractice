package kl.practice.Creational.AbstractFactory.Checkboxes;

public class MacCheckbox implements Checkbox{

    @Override
    public void render() {
        System.out.println("rendering mac button");
    }

    @Override
    public void setChecked(boolean status) {
        System.out.println("Mac Checked status = "+status);
    }
}
