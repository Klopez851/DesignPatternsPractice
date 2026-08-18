package kl.practice.Creational.Prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DragonEnemyTemplate implements Enemy{
    private String name = "dragondeez", armor = "scales";
    private Weapon weapon = new Weapon("claws", 30);
    private int health = 300, attack = 60, defense = 50;
    private double speed = 3.0;
    private List<String> abilities = generateAbilities();

    @Override
    public Enemy clone() {
        List<String> abilities = new ArrayList<>(this.abilities);
        return new DragonEnemyTemplate(this.name,this.armor,new Weapon(this.weapon.name, this.weapon.damage), this.health,this.attack,
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
