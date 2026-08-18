package kl.practice.Creational.Prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrcEnemyTemplate implements Enemy{
    private String name = "orc", armor = "leather";
    private Weapon weapon = new Weapon("axe", 20);
    private int health = 100, attack = 15, defense = 30;
    private double speed = 2.5;
    private List<String> abilities = generateAbilities();

    @Override
    public Enemy clone() {
        List<String> abilities = new ArrayList<>(this.abilities);
        return new OrcEnemyTemplate(this.name,this.armor,new Weapon(this.weapon.name, this.weapon.damage), this.health,this.attack,
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
