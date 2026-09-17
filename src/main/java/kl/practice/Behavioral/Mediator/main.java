
package kl.practice.Behavioral.Mediator;
/*
============================================================
MEDIATOR DESIGN PATTERN — EXERCISE 1
============================================================

SCENARIO:

You're building a simple chat room.

Several users can send messages to each other.

Without the Mediator pattern, you might end up with Users
directly knowing about every other User:

    Alice -> Bob
    Alice -> Charlie
    Bob -> Alice
    Bob -> Charlie
    Charlie -> Alice
    Charlie -> Bob

As the number of users grows, this becomes difficult to
manage.

Instead, introduce a:

    ChatRoom

The ChatRoom will act as the Mediator.

Users should communicate through the ChatRoom rather than
directly communicating with each other.


YOUR TASK:

Create:

    1. User

       A User should have:

           name
           ChatRoom reference

       It should have a method such as:

           sendMessage(String message)

       and a method for receiving messages:

           receiveMessage(String sender, String message)


    2. ChatRoom

       The ChatRoom should keep track of registered users.

       It should have methods such as:

           registerUser(User user)
           sendMessage(User sender, String message)


    3. Connect everything together.

Example:

    ChatRoom chatRoom = new ChatRoom();

    User alice = new User("Alice", chatRoom);
    User bob = new User("Bob", chatRoom);
    User charlie = new User("Charlie", chatRoom);

    chatRoom.registerUser(alice);
    chatRoom.registerUser(bob);
    chatRoom.registerUser(charlie);

    alice.sendMessage("Hello everyone!");


EXPECTED BEHAVIOR:

When Alice sends:

    "Hello everyone!"

The ChatRoom should receive the message and distribute it
to the appropriate users.

For example:

    Bob receives:
        Alice: Hello everyone!

    Charlie receives:
        Alice: Hello everyone!


IMPORTANT:

Alice should NOT contain:

    bob.receiveMessage(...);
    charlie.receiveMessage(...);


Alice only communicates with:

    ChatRoom


The basic relationship should look like:

             Alice
               |
               v
             ChatRoom
             /      \
            v        v
          Bob      Charlie


QUESTIONS TO THINK ABOUT WHILE IMPLEMENTING:

1. Who is the Mediator?

2. Who are the Colleagues?

3. Does User need to know about other Users?

4. What happens if you add a fourth User?

5. Does Alice need to change?

6. Who is responsible for deciding which users receive
   a message?

7. Why is this better than having every User communicate
   directly with every other User?

8. What would happen to the number of relationships between
   objects if you had 100 users?

9. Should ChatRoom contain User-specific behavior, or should
   it simply coordinate communication?

10. What happens if a User sends a message before being
    registered with the ChatRoom?


============================================================
FOLLOW-UP EXERCISE 2 — PRIVATE MESSAGES
============================================================

Now extend your chat application.

Users should be able to send both:

    1. Broadcast messages
    2. Private messages


For example:

    alice.sendMessage("Hello everyone!");

should send the message to everyone else.

But:

    alice.sendPrivateMessage(bob, "Hey Bob!");

should ONLY send the message to Bob.


YOUR TASK:

Add support for private messages.

The important part:

Alice should STILL NOT communicate directly with Bob.

Do NOT do this:

    bob.receiveMessage(...);


Instead, Alice should ask the Mediator to deliver the message.

Conceptually:

    Alice
      |
      | "Send this to Bob"
      v
    ChatRoom
      |
      | "Deliver to Bob"
      v
    Bob


The ChatRoom should be responsible for locating Bob and
delivering the message.


EXPECTED BEHAVIOR:

Broadcast:

    alice.sendMessage("Hello!");

    Bob receives:
        Alice: Hello!

    Charlie receives:
        Alice: Hello!


Private:

    alice.sendPrivateMessage(bob, "Hey Bob!");

    Bob receives:
        [Private] Alice: Hey Bob!

    Charlie receives nothing.


CONSTRAINTS:

1. Alice must not directly call Bob's methods.

2. Bob must not need to know how Alice found him.

3. The ChatRoom should coordinate the communication.

4. The User class should not contain logic for finding
   another User.

5. Adding a new User should not require modifying existing
   Users.


BONUS:

Add user status:

    ONLINE
    OFFLINE

If Alice sends Bob a private message while Bob is offline,
the ChatRoom should handle the situation appropriately.

You could simply print:

    "Bob is offline."

Don't worry about implementing message persistence yet.


EXTRA BONUS:

Imagine your chat application eventually supports:

    - private messages
    - group messages
    - notifications
    - user status changes
    - moderation
    - message logging

Think about whether putting ALL of this logic directly into
ChatRoom would eventually create a huge class.

If so, what responsibilities could potentially be extracted
into other objects?


============================================================
FINAL REFLECTION
============================================================

After finishing both exercises, answer these in your own words:

1. What problem does the Mediator pattern solve?

2. What is the responsibility of the Mediator?

3. What are the Colleague objects?

4. Why shouldn't Alice directly communicate with Bob?

5. What happens to the system's coupling when you introduce
   the ChatRoom?

6. What happens when you add a new User?

7. What happens when you add a new type of communication?

8. What are the potential disadvantages of putting too much
   logic into the Mediator?

9. How is Mediator different from Observer?

10. How is Mediator different from Chain of Responsibility?

11. Give one real-world example where a Mediator might be
    useful.

12. Give one example where using a Mediator would probably
    be unnecessary complexity.


============================================================
*/
public class main {
}
