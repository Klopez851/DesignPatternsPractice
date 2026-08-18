package kl.practice.Creational.Singleton;

/*
 * SINGLETON PATTERN EXERCISE: Application Configuration
 *
 * Your application has configuration that should be shared by
 * the entire application.
 *
 * Examples:
 *
 *     databaseUrl
 *     apiKey
 *     environment
 *     debugMode
 *
 *
 * ============================================================
 * GOAL
 * ============================================================
 *
 * There should be exactly ONE ApplicationConfig object in
 * the application.
 *
 * Any part of the application that asks for the configuration
 * should receive the SAME instance.
 *
 *
 * Example desired usage:
 *
 *     ApplicationConfig config =
 *         ApplicationConfig.getInstance();
 *
 *     config.setEnvironment("production");
 *
 *
 * Somewhere else:
 *
 *     ApplicationConfig anotherConfig =
 *         ApplicationConfig.getInstance();
 *
 *
 * The following must be true:
 *
 *     config == anotherConfig
 *
 *
 * ============================================================
 * REQUIREMENTS
 * ============================================================
 *
 * 1. Create an ApplicationConfig class containing:
 *
 *        String databaseUrl
 *        String apiKey
 *        String environment
 *        boolean debugMode
 *
 *
 * 2. Prevent outside code from directly constructing the class.
 *
 *
 * 3. Provide a way for code to obtain the single instance.
 *
 *
 * 4. Verify that multiple calls to your access method return
 *    the exact same object.
 *
 *
 * 5. Verify that changing the configuration through one
 *    reference is visible through another reference.
 *
 *
 * Example:
 *
 *     ApplicationConfig a = ApplicationConfig.getInstance();
 *     ApplicationConfig b = ApplicationConfig.getInstance();
 *
 *     a.setEnvironment("production");
 *
 *     System.out.println(b.getEnvironment());
 *
 * The output should be:
 *
 *     production
 *
 *
 * ============================================================
 * IMPORTANT
 * ============================================================
 *
 * Don't just think:
 *
 *     "I need a private constructor."
 *
 * Ask yourself:
 *
 *     "What prevents a second instance from existing?"
 *
 * The Singleton requirement is about the INVARIANT:
 *
 *     There must only be one instance.
 *
 *
 * ============================================================
 * AFTER IMPLEMENTING
 * ============================================================
 *
 * Explain:
 *
 * 1. Why is the constructor private?
 *
 * 2. Where is the single instance stored?
 *
 * 3. How does getInstance() guarantee that callers receive
 *    the same object?
 *
 * 4. What would happen if the constructor were public?
 *
 * 5. Is having a static getInstance() method alone enough
 *    to guarantee Singleton?
 */

/*
 * SINGLETON PATTERN FOLLOW-UP: Thread Safety
 *
 * Your ApplicationConfig Singleton is now used by a large
 * multithreaded server.
 *
 * Hundreds of requests can call:
 *
 *     ApplicationConfig.getInstance()
 *
 * simultaneously.
 *
 *
 * ============================================================
 * CHALLENGE 1 — FIND THE BUG
 * ============================================================
 *
 * Suppose your implementation uses lazy initialization:
 *
 *
 *     private static ApplicationConfig instance;
 *
 *     public static ApplicationConfig getInstance() {
 *
 *         if (instance == null) {
 *             instance = new ApplicationConfig();
 *         }
 *
 *         return instance;
 *     }
 *
 *
 * Explain how TWO threads could potentially cause more than
 * one instance to be created.
 *
 *
 * Think about this sequence:
 *
 *
 * Thread A                  Thread B
 * --------                  --------
 * instance == null
 *                           instance == null
 * new ApplicationConfig()
 *                           new ApplicationConfig()
 *
 *
 * ============================================================
 * CHALLENGE 2 — FIX IT
 * ============================================================
 *
 * Modify your implementation so that the Singleton guarantee
 * remains true even when multiple threads call getInstance()
 * simultaneously.
 *
 *
 * You may choose ONE approach:
 *
 *     - synchronized access
 *     - eager initialization
 *     - another thread-safe Java approach you understand
 *
 *
 * Don't blindly copy an implementation.
 *
 * Be able to explain WHY your approach prevents two instances
 * from being created.
 *
 *
 * ============================================================
 * CHALLENGE 3 — BREAK YOUR OWN SINGLETON
 * ============================================================
 *
 * Try to think of ways someone could accidentally violate
 * your Singleton guarantee.
 *
 * Consider:
 *
 *     - public constructors
 *     - multiple instance fields
 *     - serialization
 *     - reflection
 *     - cloning
 *
 * You don't necessarily need to implement every attack.
 *
 * Identify which ones could theoretically create another
 * instance and explain why.
 *
 *
 * ============================================================
 * CHALLENGE 4 — DESIGN CRITIQUE
 * ============================================================
 *
 * A teammate says:
 *
 *     "Singleton is useful because it lets every class access
 *      the configuration globally."
 *
 * Do you agree?
 *
 * Explain the difference between:
 *
 *     GLOBAL ACCESS
 *
 * and:
 *
 *     UNIQUE INSTANCE
 *
 *
 * ============================================================
 * CHALLENGE 5 — QUESTION THE PATTERN
 * ============================================================
 *
 * Your teammate proposes:
 *
 *
 *     class OrderService {
 *
 *         private ApplicationConfig config =
 *             ApplicationConfig.getInstance();
 *     }
 *
 *
 * Now imagine you want to unit test OrderService with a fake
 * configuration.
 *
 * Explain what problem the Singleton can create here.
 *
 * Think about:
 *
 *     testing
 *     hidden dependencies
 *     coupling
 *     global state
 *
 *
 * ============================================================
 * FINAL QUESTION
 * ============================================================
 *
 * In your own words:
 *
 * What problem does Singleton actually solve?
 *
 * Don't answer:
 *
 *     "It gives you a global object."
 *
 * Instead explain:
 *
 *     1. What invariant does it guarantee?
 *     2. How does it control object creation?
 *     3. Why might that guarantee be useful?
 *     4. Why might using Singleton still be a bad design
 *        decision in some situations?
 */

public class Main {

    public static void main(String[] args) {
        ApplicationConfigs config = ApplicationConfigs.getInstance();
        ApplicationConfigs anotherConfig = ApplicationConfigs.getInstance();

        System.out.println(config);
        System.out.println(anotherConfig);
        System.out.println();
        config.setDebugMode(true);
        System.out.println(anotherConfig);
        anotherConfig.setApiKey("yet_another_api_key");
        System.out.println(config);
        System.out.println(config.equals(anotherConfig));

    }
}
