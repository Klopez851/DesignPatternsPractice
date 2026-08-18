package kl.practice.Creational.Prototype;

/*
 * PROTOTYPE PATTERN EXERCISE: Game Enemy Templates
 *
 * You are building a game with many enemies.
 *
 * Creating an enemy from scratch can be expensive because an
 * enemy contains lots of configuration:
 *
 *     - name
 *     - health
 *     - attack
 *     - defense
 *     - speed
 *     - weapon
 *     - armor
 *     - List<String> abilities
 *
 *
 * ============================================================
 * GOAL
 * ============================================================
 *
 * The game has preconfigured enemy templates.
 *
 * For example:
 *
 *     Goblin Template
 *     Orc Template
 *     Dragon Template
 *
 * When the game needs a new enemy, it should be able to copy
 * an existing template and then customize the copy.
 *
 *
 * Example desired usage:
 *
 *     Enemy goblin = goblinTemplate.clone();
 *
 *     goblin.setName("Goblin #27");
 *     goblin.setHealth(80);
 *
 *
 * ============================================================
 * REQUIREMENTS
 * ============================================================
 *
 * 1. Create an Enemy class containing:
 *
 *        String name
 *        int health
 *        int attack
 *        int defense
 *        double speed
 *        String weapon
 *        String armor
 *        List<String> abilities
 *
 *
 * 2. Give Enemy a clone() method that produces another Enemy
 *    with the same initial state.
 *
 *
 * 3. Create at least THREE templates:
 *
 *        goblinTemplate
 *        orcTemplate
 *        dragonTemplate
 *
 *    Configure each with different stats, equipment, and
 *    abilities.
 *
 *
 * 4. Create new enemies by cloning the templates instead of
 *    constructing every enemy from scratch.
 *
 *
 * Example:
 *
 *     Enemy goblin1 = goblinTemplate.clone();
 *     Enemy goblin2 = goblinTemplate.clone();
 *     Enemy goblin3 = goblinTemplate.clone();
 *
 *
 * ============================================================
 * IMPORTANT
 * ============================================================
 *
 * After cloning:
 *
 *     goblin1.setName("Goblin #1");
 *
 * should NOT change:
 *
 *     goblin2
 *     goblin3
 *     goblinTemplate
 *
 *
 * The copies must behave as independent objects.
 *
 *
 * ============================================================
 * CHALLENGE — COLLECTIONS
 * ============================================================
 *
 * The abilities field is a:
 *
 *     List<String>
 *
 * Make sure modifying the cloned enemy's abilities does NOT
 * modify the original template's abilities.
 *
 *
 * For example:
 *
 *     Enemy goblin1 = goblinTemplate.clone();
 *
 *     goblin1.getAbilities().add("Poison Attack");
 *
 *
 * The original template should NOT suddenly gain:
 *
 *     "Poison Attack"
 *
 *
 * Think carefully about whether simply copying the List
 * reference is enough.
 *
 *
 * ============================================================
 * TEST
 * ============================================================
 *
 * Create:
 *
 *     Enemy goblinTemplate
 *
 * Then:
 *
 *     Enemy goblin1 = goblinTemplate.clone();
 *     Enemy goblin2 = goblinTemplate.clone();
 *
 * Modify goblin1.
 *
 * Verify:
 *
 *     goblin1 != goblinTemplate
 *     goblin2 != goblinTemplate
 *     goblin1 != goblin2
 *
 * And verify that modifying one does not unexpectedly modify
 * the others.
 *
 *
 * ============================================================
 * AFTER IMPLEMENTING
 * ============================================================
 *
 * Explain:
 *
 * 1. Why is cloning useful here instead of simply using:
 *
 *        new Enemy(...)
 *
 * 2. What state should be copied?
 *
 * 3. Why does the abilities List require special attention?
 *
 * 4. What is the difference between copying an object's state
 *    and creating a completely independent object?
 *
 * 5. What would happen if your clone() method copied the
 *    abilities reference instead of creating a new List?
 */

/*
 * PROTOTYPE PATTERN FOLLOW-UP
 *
 * Your game now has dozens of enemy types.
 *
 * You don't want the game code to know which concrete Enemy
 * template exists or how each one is constructed.
 *
 *
 * ============================================================
 * CHALLENGE 1 — PROTOTYPE REGISTRY
 * ============================================================
 *
 * Create an EnemyRegistry that stores prototype enemies.
 *
 * Conceptually:
 *
 *
 *     EnemyRegistry
 *          |
 *          +── "goblin"  → Goblin prototype
 *          |
 *          +── "orc"     → Orc prototype
 *          |
 *          +── "dragon"  → Dragon prototype
 *
 *
 * The client should be able to do:
 *
 *     Enemy enemy = registry.create("goblin");
 *
 *
 * The registry should:
 *
 *     1. Find the appropriate prototype.
 *     2. Clone it.
 *     3. Return the clone.
 *
 *
 * The client should NOT need to know:
 *
 *     new Goblin(...)
 *     new Orc(...)
 *     new Dragon(...)
 *
 *
 * ============================================================
 * CHALLENGE 2 — ADD A NEW ENEMY
 * ============================================================
 *
 * Add:
 *
 *     Skeleton
 *
 * You should be able to add the Skeleton prototype to the
 * registry without changing the logic of:
 *
 *     registry.create()
 *
 *
 * ============================================================
 * CHALLENGE 3 — DEEP COPY
 * ============================================================
 *
 * Now change Enemy so that it contains:
 *
 *     Weapon weapon
 *
 * where Weapon is a mutable object:
 *
 *     class Weapon {
 *         String name;
 *         int damage;
 *     }
 *
 *
 * Example:
 *
 *     goblinTemplate.weapon.damage = 10;
 *
 *
 * If:
 *
 *     Enemy goblin1 = goblinTemplate.clone();
 *
 * then modifying:
 *
 *     goblin1.weapon.damage = 100;
 *
 * should NOT modify:
 *
 *     goblinTemplate.weapon.damage
 *
 *
 * Your clone operation must therefore correctly handle the
 * nested mutable object.
 *
 *
 * ============================================================
 * CHALLENGE 4 — THINK ABOUT THE DESIGN
 * ============================================================
 *
 * Compare these two approaches:
 *
 *
 * APPROACH A:
 *
 *     new Goblin(...)
 *
 *
 * APPROACH B:
 *
 *     registry.create("goblin")
 *
 *
 * Explain what dependency the second approach removes from
 * the client.
 *
 *
 * ============================================================
 * CHALLENGE 5 — IMPORTANT
 * ============================================================
 *
 * Suppose creating a Dragon requires:
 *
 *     - loading textures
 *     - loading animations
 *     - configuring abilities
 *     - loading AI parameters
 *     - validating stats
 *
 * and takes significant setup work.
 *
 * Explain why Prototype could be useful here.
 *
 *
 * ============================================================
 * FINAL QUESTION
 * ============================================================
 *
 * In your own words:
 *
 * What is Prototype actually separating?
 *
 * Don't answer:
 *
 *     "It lets you clone objects."
 *
 * Go one level deeper.
 *
 * Think about:
 *
 *     Where does the initial state of the new object come from?
 *
 *     What work are we avoiding?
 *
 *     What does the client no longer need to know?
 *
 *     How is this different from Builder?
 *
 *     How is this different from Factory Method?
 */

public class Main {
    public static void main(String[] args) {
        GoblinEnemyTemplate goblinTemplate = new GoblinEnemyTemplate();

        Enemy goblin3 = goblinTemplate.clone();
        Enemy goblin1 = goblinTemplate.clone();
        Enemy goblin2 = goblinTemplate.clone();

        goblin1.setName("goblin1");
        goblin2.setName("goblin2");

        System.out.println(goblin3.toString());
        System.out.println(goblin1.toString());
        System.out.println(goblin2.toString());

        goblin1.getAbilities().add("poison arrow");
        System.out.println();

        System.out.println(goblin3.toString());
        System.out.println(goblin1.toString());
        System.out.println(goblin2.toString());

        System.out.println(goblin3.getWeapon().damage);

        Enemy goblin = EnemyRegistry.create("goblin");
        Enemy goblinA = EnemyRegistry.create("goblin");

        goblin.getWeapon().damage=10000;

        System.out.println(goblin);
        System.out.println(goblinA);

    }
}
