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
public class GoblinEnemyTemplate implements Enemy{
    private String name = "goblin", weapon = "bow", armor = "none";
    private int health = 50, attack = 10, defense = 15;
    private double speed = 4.0;
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
        abilities.add("shoot arrow");
        abilities.add("hide");
        abilities.add("scream");
        abilities.add("flee");

        return abilities;
    }
}
