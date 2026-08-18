package kl.practice.Creational.Prototype;

public class EnemyRegistry {
    public static Enemy create(String enemy){
        return switch (enemy) {
            case "goblin" -> new GoblinEnemyTemplate().clone();
            case "orc" -> new OrcEnemyTemplate().clone();
            case "dragon" -> new DragonEnemyTemplate().clone();
            case "skeleton" -> new SkeletonEnemyTemplate().clone();
            default -> throw new IllegalArgumentException("no such entity exists");
        };
    }
}
