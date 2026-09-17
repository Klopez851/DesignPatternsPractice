package kl.practice.Structural.Flyweight;

/*
 * ============================================================
 * 6. FLYWEIGHT — Game Trees
 * ============================================================
 *
 * INITIAL EXERCISE
 *
 * Create a game with many trees.
 *
 * Each Tree has:
 *
 *     x
 *     y
 *     health
 *     TreeType
 *
 * TreeType contains:
 *
 *     name
 *     texture
 *     model
 *
 * There are only:
 *
 *     Oak
 *     Pine
 *     Birch
 *
 * but potentially 100,000 Tree objects.
 *
 * Make sure the TreeType information is shared between trees
 * of the same type.
 *
 * Example:
 *
 *     Tree oak1 = ...
 *     Tree oak2 = ...
 *
 * oak1 and oak2 should share their TreeType.
 *
 * But:
 *
 *     oak1.x != oak2.x
 *     oak1.health != oak2.health
 *
 *
 * FOLLOW-UP
 *
 * Add:
 *
 *     Maple
 *     Redwood
 *     Willow
 *
 * The Tree creation code should not need to manually create
 * a new TreeType every time someone requests one.
 *
 * Then add a method:
 *
 *     getNumberOfTreeTypesCreated()
 *
 * Create 10,000 trees using only the existing tree types.
 *
 * Verify that the number of TreeType objects is still only the
 * number of unique tree types rather than 10,000.
 *
 * Finally:
 *
 *     Make TreeType immutable.
 *
 * QUESTION TO CONSIDER:
 *
 * Why is immutability particularly useful for Flyweight?
 *
 * ============================================================
 */

import kl.practice.Structural.Flyweight.TreeTypes.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {
    public static int getNumberOfTreeTypesCreated(List<Tree> trees, Map<String, TreeType> treeTypes){
        int uniqueTreeTypes = 6;//should be 6, will increase only if there ae more unique types
        for(int i = 0; i<trees.size();i++){
            if(trees.get(i).getTreeType() != treeTypes.get(trees.get(i).getTreeType().getMODEL())){
                uniqueTreeTypes++;
            }
        }
        return uniqueTreeTypes;
    }

    public static void main(String[] args) {
        Map<String, TreeType> treeTypes = new HashMap<>();
        treeTypes.put("Oak", new Oak());
        treeTypes.put("Birch", new Birch());
        treeTypes.put("Maple", new Maple());
        treeTypes.put("Pine", new Pine());
        treeTypes.put("Redwood", new Redwood());
        treeTypes.put("Willow", new Willow());

        List<Tree> trees = new ArrayList<>();
        int totalNumberOftrees= 0;

        while(totalNumberOftrees!=10000){

            for(TreeType treetype : treeTypes.values()){
                if(totalNumberOftrees==10000){
                    break;
                }
                trees.add(new Tree(1,2,100,treetype));
                totalNumberOftrees++;
            }

        }

        System.out.println(getNumberOfTreeTypesCreated(trees, treeTypes));




    }
}
