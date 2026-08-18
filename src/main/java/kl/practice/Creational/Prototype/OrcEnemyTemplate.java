package kl.practice.Creational.Prototype;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class OrcEnemyTemplate implements Enemy{
    private String name = "orc", weapon = "axe", armor = "leather";
    private int health = 100, attack = 15, defense = 30;
    private double speed = 2.5;
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
        abilities.add("axe swing");
        abilities.add("stomp");
        abilities.add("scream");
        abilities.add("shield");

        return abilities;
    }
}
