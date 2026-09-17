package kl.practice.Behavioral.State;
/*
============================================================
STATE DESIGN PATTERN — EXERCISE 1
============================================================

SCENARIO:

You're building a simple vending machine.

The vending machine can be in one of these states:

    NO_COIN
    HAS_COIN
    SOLD_OUT

The behavior of the machine depends on its current state.

For example:

    NO_COIN
        insertCoin() -> accept the coin

    HAS_COIN
        insertCoin() -> reject the extra coin
        selectProduct() -> dispense the product

    SOLD_OUT
        insertCoin() -> reject the coin
        selectProduct() -> tell the customer it's sold out


YOUR TASK:

Implement the State design pattern from scratch.

Create:

    1. State interface

       It should contain the operations that behave
       differently depending on the machine's state.

       For example:

           insertCoin()
           selectProduct()
           dispense()

    2. NoCoinState

    3. HasCoinState

    4. SoldOutState

    5. VendingMachine

The VendingMachine should contain:

    - current state
    - number of products

The VendingMachine should delegate state-dependent
behavior to its current State object.


EXPECTED USAGE:

    VendingMachine machine = new VendingMachine(2);

    machine.insertCoin();
    machine.selectProduct();

    machine.insertCoin();
    machine.selectProduct();


EXPECTED BEHAVIOR:

Initially:

    VendingMachine -> NO_COIN

When:

    insertCoin()

the machine moves to:

    HAS_COIN


When:

    selectProduct()

the machine should dispense a product and return to:

    NO_COIN


When there are no products left:

    SOLD_OUT


The general flow should look like:

        NO_COIN
           |
      insertCoin()
           |
           v
       HAS_COIN
           |
     selectProduct()
           |
           v
        NO_COIN


If the final product is dispensed:

       HAS_COIN
           |
     selectProduct()
           |
           v
       SOLD_OUT


IMPORTANT:

Try NOT to implement the VendingMachine like this:

    if (state == NO_COIN) {
        ...
    }
    else if (state == HAS_COIN) {
        ...
    }
    else if (state == SOLD_OUT) {
        ...
    }


The goal is for each State object to contain the behavior
associated with that state.


Think about the responsibilities:

                  VendingMachine
                       |
                       v
                  Current State
                       |
          +------------+------------+
          |            |            |
          v            v            v
       NoCoin       HasCoin      SoldOut


QUESTIONS TO THINK ABOUT WHILE IMPLEMENTING:

1. What does the State interface represent?

2. Who owns the current state?

3. Who is responsible for changing the state?

4. Should NoCoinState know about HasCoinState?

5. Should the VendingMachine know about every concrete
   state?

6. What happens when insertCoin() is called while already
   in HAS_COIN?

7. What happens when selectProduct() is called in NO_COIN?

8. Why is this approach better than one giant switch
   statement?

9. What happens if you add another state?

10. Where should the transition from one state to another
    happen?


============================================================
FOLLOW-UP EXERCISE 2 — ADD A MAINTENANCE STATE
============================================================

Now imagine the vending machine needs to support maintenance.

Add a new state:

    MAINTENANCE

When the machine is in maintenance mode:

    insertCoin()
        -> "Machine is under maintenance."

    selectProduct()
        -> "Machine is under maintenance."

The machine should not dispense products while in
maintenance.


Add methods to VendingMachine such as:

    startMaintenance()
    endMaintenance()


Example:

    machine.insertCoin();

    machine.startMaintenance();

    machine.selectProduct();

    machine.insertCoin();

    machine.endMaintenance();


Think carefully about what state the machine should return
to after maintenance ends.


YOUR TASK:

Modify your State design so that:

    NO_COIN
    HAS_COIN
    SOLD_OUT
    MAINTENANCE

are all represented by separate State objects.


CONSTRAINTS:

1. Do NOT add another large switch statement.

2. Do NOT put all maintenance logic directly inside
   VendingMachine.

3. The behavior of the machine while in MAINTENANCE should
   belong to MaintenanceState.

4. Existing states should continue to work.

5. State transitions should be explicit and understandable.


BONUS:

Think about this situation:

    Machine is in HAS_COIN

    startMaintenance()

Should the machine:

    A) Enter maintenance and keep the inserted coin?

    B) Return/refund the coin before entering maintenance?

    C) Reject maintenance mode until the coin is removed?

Choose one behavior and implement it.

There isn't necessarily one universally correct answer.
The important part is that you identify the state transition
and make the behavior explicit.


EXTRA BONUS:

Add an OUT_OF_ORDER state.

Now the machine can be:

    NO_COIN
    HAS_COIN
    SOLD_OUT
    MAINTENANCE
    OUT_OF_ORDER


Ask yourself:

    Does the VendingMachine class become more complicated
    every time you add a state?

If it does, look at your design and see whether you're
actually getting the benefit of the State pattern.


============================================================
FINAL REFLECTION
============================================================

After finishing both exercises, answer these in your own words:

1. What problem does the State pattern solve?

2. What is a State object responsible for?

3. What is the Context?

4. In this exercise, which class is the Context?

5. Why is VendingMachine called the Context?

6. What is the difference between State and Strategy?

7. Why can State help eliminate large if/else or switch
   statements?

8. Who should be responsible for state transitions?

9. What happens when you add a new state?

10. What are the disadvantages of having many State classes?

11. When might a simple enum + switch actually be better
    than the State pattern?

12. Where might you see the State pattern in real software?

    Think about:

        - Order processing
        - ATM machines
        - Network connections
        - Video players
        - Game characters
        - Traffic lights
        - User authentication
        - Workflow systems

13. Give an example where an object's behavior changes
    depending on its current state.

14. Give an example where State would probably be
    unnecessary complexity.


============================================================
*/
public class main {
}
