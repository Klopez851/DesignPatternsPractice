package kl.practice.Behavioral.Interpreter;
/*
============================================================
INTERPRETER DESIGN PATTERN — EXERCISE 1
============================================================

SCENARIO:

You're building a very simple permission system.

You want to be able to write permission expressions such as:

    ADMIN

    USER

    ADMIN AND USER

    ADMIN OR USER


The system should take an expression and determine whether
a particular user satisfies it.

For example:

    User:
        roles = [ADMIN]

Expression:

    ADMIN

Result:

    true


Expression:

    ADMIN AND USER

Result:

    false


Expression:

    ADMIN OR USER

Result:

    true


YOUR TASK:

Implement the Interpreter design pattern from scratch.


STEP 1 — CREATE THE CONTEXT

Create a class:

    UserContext

It should contain information about the current user's
roles.

For example:

    ADMIN
    USER
    MODERATOR


Give it a method that allows you to check whether the user
has a particular role.


STEP 2 — CREATE THE ABSTRACT EXPRESSION

Create an interface:

    Expression

with something similar to:

    boolean interpret(UserContext context)


Every expression in your language should implement this
interface.


STEP 3 — CREATE A TERMINAL EXPRESSION

Create:

    RoleExpression


For example:

    new RoleExpression("ADMIN")


When interpreted, it should return true if the user has
that role.


STEP 4 — CREATE A NON-TERMINAL EXPRESSION

Create:

    AndExpression


It should contain two Expressions.

For example:

    Expression expression =
        new AndExpression(
            new RoleExpression("ADMIN"),
            new RoleExpression("USER")
        );


When interpreted, BOTH expressions must return true.


STEP 5 — CREATE ANOTHER NON-TERMINAL EXPRESSION

Create:

    OrExpression


It should return true if either expression is true.


EXPECTED USAGE:

    UserContext user = new UserContext();

    user.addRole("ADMIN");

    Expression expression =
        new AndExpression(
            new RoleExpression("ADMIN"),
            new RoleExpression("USER")
        );

    boolean result = expression.interpret(user);


The result should be:

    false


Now try:

    Expression expression =
        new OrExpression(
            new RoleExpression("ADMIN"),
            new RoleExpression("USER")
        );


The result should be:

    true


THE STRUCTURE SHOULD LOOK SOMETHING LIKE:

                    Expression
                    /        \
                   /          \
          RoleExpression    AndExpression
                              /       \
                             /         \
                            v           v
                         RoleExpr    RoleExpr


IMPORTANT:

Notice that both:

    RoleExpression

and:

    AndExpression

implement:

    Expression


This means expressions can be composed together.


For example:

    AND
    / \
   OR  ADMIN
  /  \
USER MODERATOR


could represent:

    (USER OR MODERATOR) AND ADMIN


QUESTIONS TO THINK ABOUT WHILE IMPLEMENTING:

1. What is the Expression?

2. What is a Terminal Expression?

3. What is a Non-Terminal Expression?

4. Why does every expression implement interpret()?

5. Why does AndExpression contain other Expressions rather
   than specifically containing RoleExpressions?

6. What happens if you want to combine an AndExpression
   inside another AndExpression?

7. Why is it useful that expressions can contain other
   expressions?

8. What does UserContext represent?

9. Is UserContext part of the grammar, or is it the data
   being interpreted?

10. Why doesn't RoleExpression directly access some global
    user object?


============================================================
FOLLOW-UP EXERCISE 2 — BUILD A MINI LANGUAGE
============================================================

Now make your permission language more interesting.

Support these expressions:

    ADMIN
    USER
    MODERATOR

and:

    AND
    OR
    NOT


You should be able to represent expressions such as:

    ADMIN AND USER

    ADMIN OR MODERATOR

    NOT ADMIN

    ADMIN AND (USER OR MODERATOR)

    NOT ADMIN AND USER


YOUR TASK:

Add:

    NotExpression


It should contain a single Expression.

For example:

    new NotExpression(
        new RoleExpression("ADMIN")
    )


If the user has ADMIN:

    ADMIN -> true

Therefore:

    NOT ADMIN -> false


If the user does not have ADMIN:

    ADMIN -> false

Therefore:

    NOT ADMIN -> true


Then combine expressions.

For example:

    new AndExpression(
        new RoleExpression("ADMIN"),

        new OrExpression(
            new RoleExpression("USER"),
            new RoleExpression("MODERATOR")
        )
    )


This represents:

    ADMIN AND (USER OR MODERATOR)


CONSTRAINTS:

1. Do NOT create a giant if/else statement.

2. Do NOT create a giant switch statement for every
   possible expression.

3. AndExpression should work with any Expression.

4. OrExpression should work with any Expression.

5. NotExpression should work with any Expression.

6. The client should be able to build increasingly
   complicated expressions by combining simpler ones.


BONUS:

Create a small parser.

Instead of manually creating:

    new AndExpression(
        new RoleExpression("ADMIN"),
        new RoleExpression("USER")
    )


allow the client to provide:

    "ADMIN AND USER"


and have your program convert that into the appropriate
Expression objects.


For example:

    String input = "ADMIN AND USER";

    Expression expression = parser.parse(input);

    boolean result = expression.interpret(user);


EXTRA BONUS:

Support parentheses:

    "ADMIN AND (USER OR MODERATOR)"


Now you are essentially creating a tiny language with:

    Grammar
       |
       v
    Parser
       |
       v
    Expression Tree
       |
       v
    Interpreter
       |
       v
    Result


Think about how your parser would need to determine:

    1. What is a role?
    2. What is AND?
    3. What is OR?
    4. What is NOT?
    5. Where does an expression begin/end?
    6. What does a parenthesis mean?


============================================================
FINAL REFLECTION
============================================================

After finishing both exercises, answer these in your own words:

1. What problem does the Interpreter pattern solve?

2. What is the "language" in this exercise?

3. What is the grammar?

4. What is the Context?

5. What is a Terminal Expression?

6. What is a Non-Terminal Expression?

7. Why can an Expression contain other Expressions?

8. Why does this naturally create a tree structure?

9. What does interpret() actually do?

10. What happens when you add a new type of expression?

11. What happens when the grammar becomes much larger?

12. Why might Interpreter become difficult to maintain
    for a complex language?

13. When would you use a real parser library instead of
    implementing Interpreter manually?

14. How is Interpreter different from Strategy?

15. How is Interpreter different from Composite?

16. Where might Interpreter be useful in real software?

    Think about:

        - Search filters
        - Query languages
        - Configuration languages
        - Rule engines
        - Mathematical expressions
        - Permission systems
        - Boolean expressions
        - Domain-specific languages

17. Give one situation where Interpreter makes sense.

18. Give one situation where Interpreter would probably
    be unnecessary complexity.


============================================================
*/
public class main {
}
