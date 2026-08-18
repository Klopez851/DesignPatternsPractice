package kl.practice.Creational.Prototype;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class DragonEnemyTemplate implements Enemy{
    private String name = "dragondeez", weapon = "claws", armor = "scales";
    private int health = 300, attack = 60, defense = 50;
    private double speed = 3.0;
    private List<String> abilities = generateAbilities();

    @Override
    public Enemy clone() {
        List<String> abilities = new ArrayList<>(this.abilities);
        return new GoblinEnemyTemplate(this.name, this.weapon, this.armor, this.health,this.attack,
                this.defense,this.speed,abilities);
    }

    public String toString(){
        return "Goblin - Name: "+name+" weapon: "+weapon+" Armor: "+armor+" health: "+health+" attack: "+attack+
                " defense: "+defense+" speed: "+speed+" abilities: "+abilities.toString();
    }

    private List<String> generateAbilities(){
        List<String> abilities = new ArrayList<>();
        abilities.add("fire breath");
        abilities.add("tail swoop");
        abilities.add("scream");
        abilities.add("fly");

        return abilities;
    }
}
