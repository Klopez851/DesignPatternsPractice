package kl.practice.Structural.Flyweight;

import kl.practice.Structural.Flyweight.TreeTypes.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Tree {
    private int x;
    private int y;
    private int health;
    private TreeType treeType;

    public Tree (int x, int y, int health, TreeType type){
        this.x = x;
        this.y = y;
        this.health = health;
        this.treeType = type;
    }



}
