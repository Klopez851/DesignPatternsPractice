package kl.practice.Creational.Prototype;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Weapon {
    public String name;
    public int damage;

    public String toString(){
        return "name -"+name+" dmg -"+damage;
    }
}
