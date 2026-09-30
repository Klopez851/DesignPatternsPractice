package kl.practice.Creational.AbstractFactory.Menus;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class LinuxMenu implements Menu{
    @Override
    public void render() {
        System.out.println("Rendering linux menu");
    }

    @Override
    public void setOptions(String options) {
        System.out.println("setting linux menu options to: "+options);
    }
}
