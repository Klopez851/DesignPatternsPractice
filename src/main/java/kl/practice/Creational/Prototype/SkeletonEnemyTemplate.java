package kl.practice.Creational.Prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SkeletonEnemyTemplate implements Enemy{
    private String name = "skeleton",armor = "leather";
    private Weapon weapon = new Weapon("bow", 15);
    private int health = 50, attack = 10, defense = 5;
    private double speed = 3.0;
    private List<String> abilities = generateAbilities();

    @Override
    public Enemy clone() {
        List<String> abilities = new ArrayList<>(this.abilities);
        return new GoblinEnemyTemplate(this.name,this.armor,new Weapon(this.weapon.name, this.weapon.damage), this.health,this.attack,
                this.defense,this.speed,abilities);
    }


    public String toString(){
        return "Goblin - Name: "+name+" weapon: "+weapon.toString()+" Armor: "+armor+" health: "+health+" attack: "+attack+
                " defense: "+defense+" speed: "+speed+" abilities: "+abilities.toString();
    }

    private List<String> generateAbilities(){
        List<String> abilities = new ArrayList<>();
        abilities.add("Bow");
        abilities.add("bone throw");
        abilities.add("scream");
        abilities.add("shield");

        return abilities;
    }
}
