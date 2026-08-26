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

public class main {
}
