package kl.practice.Behavioral.ChainOfResponsibility;
/*
============================================================
CHAIN OF RESPONSIBILITY — EXERCISE 1
============================================================

SCENARIO:

You're building a customer support system.

A customer can submit a SupportRequest with a priority:

    LOW
    MEDIUM
    HIGH

There are three levels of support:

    Level1Support
    Level2Support
    Manager

Each handler has a maximum priority it can handle:

    Level1Support -> LOW
    Level2Support -> MEDIUM
    Manager       -> HIGH


YOUR TASK:

Implement the Chain of Responsibility pattern from scratch.

Create:

    1. Priority enum
    2. SupportRequest class
    3. Handler interface
    4. Level1Support
    5. Level2Support
    6. Manager

The client should be able to do something like:

    Handler chain = ...;

    chain.handle(new SupportRequest(
        "My account is locked",
        Priority.MEDIUM
    ));


EXPECTED BEHAVIOR:

LOW request:

    Level1Support handles it.

MEDIUM request:

    Level1Support passes it to Level2Support.
    Level2Support handles it.

HIGH request:

    Level1Support passes it to Level2Support.
    Level2Support passes it to Manager.
    Manager handles it.


IMPORTANT:

The client should NOT need to know which handler will
ultimately process the request.

The client should only interact with the first handler
in the chain.


QUESTIONS TO THINK ABOUT WHILE IMPLEMENTING:

1. Where should each handler store its "next" handler?

2. How should a handler pass a request to the next handler?

3. What should happen if there is no next handler?

4. Should the handlers know about concrete handler classes,
   or should they depend on an abstraction?

5. Where should the chain be constructed?

6. Can you add another handler without changing the client?

7. Draw your final design:

       Client
          |
          v
       Level1
          |
          v
       Level2
          |
          v
       Manager


============================================================
FOLLOW-UP EXERCISE 2 — EXTEND THE CHAIN
============================================================

Now imagine the company adds a new type of request:

    Priority.CRITICAL

Critical requests must be handled by a new:

    Director

The new chain should be:

       Level1
          |
          v
       Level2
          |
          v
       Manager
          |
          v
       Director


YOUR TASK:

Modify your implementation so that:

    LOW      -> Level1
    MEDIUM   -> Level2
    HIGH     -> Manager
    CRITICAL -> Director


CONSTRAINTS:

1. Do NOT modify the client code.

2. Do NOT put a giant if/else or switch statement in the client.

3. You should only need to introduce the new handler and
   make the necessary changes to the chain configuration.

4. Existing handlers should continue to work exactly as before.


BONUS:

Try adding a completely different handler:

    TechnicalSupport

Instead of using priority, make it responsible for requests
whose category is:

    TECHNICAL

Now think about this:

    Does every handler have to decide based on the same
    property of the request?

Could your chain support handlers that make decisions based
on different criteria?


============================================================
FINAL REFLECTION
============================================================

After finishing both exercises, answer these in your own words:

1. What problem is Chain of Responsibility solving here?

2. What does the client know about the chain?

3. What does an individual handler know about the chain?

4. Why is it useful that a handler only knows about "next"
   rather than knowing about every handler?

5. What would become difficult if you handled everything
   with one giant if/else statement?

6. What are the main advantages of your implementation?

7. What are the main disadvantages?


============================================================
*/
public class main {
}
