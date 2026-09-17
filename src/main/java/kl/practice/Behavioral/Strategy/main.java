package kl.practice.Behavioral.Strategy;
/*
============================================================
STRATEGY DESIGN PATTERN — EXERCISE 1
============================================================

SCENARIO:

You're building a navigation application.

Your application needs to calculate routes between locations.

There are several ways to calculate a route:

    DRIVING
    WALKING
    CYCLING

Each route type uses a different algorithm.

Instead of putting everything inside NavigationService:

    if (type == DRIVING) {
        ...
    }
    else if (type == WALKING) {
        ...
    }
    else if (type == CYCLING) {
        ...
    }

you want to use the Strategy design pattern.


YOUR TASK:

Implement the Strategy pattern from scratch.

Create:

    1. RouteStrategy interface

       It should define something like:

           calculateRoute(String start, String destination)

       The exact return type is up to you.

    2. DrivingRouteStrategy

    3. WalkingRouteStrategy

    4. CyclingRouteStrategy

Each strategy should implement the RouteStrategy interface
with its own behavior.


    5. NavigationService

The NavigationService should contain a RouteStrategy.

It should have a way to set/change the strategy.

For example:

    NavigationService navigation = new NavigationService();

    navigation.setRouteStrategy(
        new DrivingRouteStrategy()
    );

    navigation.calculateRoute(
        "Boston",
        "New York"
    );


The NavigationService should NOT contain the actual
driving/walking/cycling algorithms.


EXPECTED BEHAVIOR:

If the strategy is:

    DrivingRouteStrategy

the application calculates a driving route.

If the strategy is:

    WalkingRouteStrategy

the application calculates a walking route.

If the strategy is:

    CyclingRouteStrategy

the application calculates a cycling route.


The basic structure should look like:

                NavigationService
                       |
                       v
                 RouteStrategy
                  /    |    \
                 /     |     \
                v      v      v
            Driving  Walking  Cycling


IMPORTANT:

The NavigationService should depend on the abstraction:

    RouteStrategy

not on:

    DrivingRouteStrategy
    WalkingRouteStrategy
    CyclingRouteStrategy


The client should be able to change the algorithm without
changing NavigationService.


QUESTIONS TO THINK ABOUT WHILE IMPLEMENTING:

1. What is the Strategy?

2. What is the Context?

3. In this example, which class is the Context?

4. Why shouldn't NavigationService contain all the route
   algorithms?

5. What does the RouteStrategy interface provide?

6. What happens if you add:

       PublicTransportRouteStrategy

   Does NavigationService need to change?

7. Can two different strategies be used by the same
   NavigationService?

8. When would you choose Strategy instead of a large
   if/else or switch?

9. Should NavigationService know which specific strategy
   it's using?

10. What advantage do you get from being able to change the
    strategy at runtime?


============================================================
FOLLOW-UP EXERCISE 2 — PAYMENT STRATEGIES
============================================================

Now build a completely different Strategy system.

You're creating an online shopping application.

Customers need to pay for their orders.

The application supports:

    CreditCard
    PayPal
    BankTransfer


Instead of creating something like:

    if (paymentType == CREDIT_CARD) {
        ...
    }
    else if (paymentType == PAYPAL) {
        ...
    }
    else if (paymentType == BANK_TRANSFER) {
        ...
    }

use the Strategy pattern.


YOUR TASK:

Create:

    1. PaymentStrategy interface

       It should contain something like:

           pay(double amount)


    2. CreditCardPayment

    3. PayPalPayment

    4. BankTransferPayment


    5. Checkout

The Checkout class should contain a PaymentStrategy.

For example:

    Checkout checkout = new Checkout();

    checkout.setPaymentStrategy(
        new CreditCardPayment()
    );

    checkout.pay(100.00);


Then allow the customer to switch strategies:

    checkout.setPaymentStrategy(
        new PayPalPayment()
    );

    checkout.pay(100.00);


The Checkout class should NOT contain the details of
how each payment method works.


CONSTRAINTS:

1. Do NOT use a large switch statement inside Checkout.

2. Do NOT put CreditCard-specific logic inside Checkout.

3. Do NOT put PayPal-specific logic inside Checkout.

4. Checkout should depend only on PaymentStrategy.

5. Each concrete payment strategy should be responsible for
   its own payment behavior.


BONUS:

Add:

    CryptoPayment

without modifying the Checkout class.

Then ask yourself:

    "Why was I able to add a completely new payment method
     without changing Checkout?"


EXTRA BONUS:

Create a ShoppingCart class.

The ShoppingCart should calculate the total price, while
Checkout should be responsible for paying that total.

Now think about the separation of responsibilities:

    ShoppingCart
        |
        | calculates
        v
      Total
        |
        v
     Checkout
        |
        v
   PaymentStrategy
      /     |      \
     v      v       v
  Credit   PayPal  Bank


============================================================
FINAL REFLECTION
============================================================

After finishing both exercises, answer these in your own words:

1. What problem does the Strategy pattern solve?

2. What is a Strategy?

3. What is the Context?

4. Why is Strategy useful when you have multiple versions
   of an algorithm?

5. What happens when you add a new Strategy?

6. Does the Context need to change when you add a new
   Strategy?

7. What's the difference between Strategy and State?

8. What's the difference between Strategy and
   Chain of Responsibility?

9. When would a simple if/else or switch be preferable
   to Strategy?

10. What are the disadvantages of using Strategy?

11. Why might Strategy result in more classes?

12. Can the Strategy be changed at runtime?

13. Where might you see Strategy in real software?

    Think about:

        - Payment methods
        - Sorting algorithms
        - Compression algorithms
        - Authentication methods
        - File formats
        - Shipping calculations
        - Pricing algorithms
        - Navigation
        - Serialization

14. Give an example where you would use Strategy.

15. Give an example where Strategy would probably be
    unnecessary complexity.


============================================================
*/
public class main {
}
