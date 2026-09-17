package kl.practice.Behavioral.Command;
/*
============================================================
COMMAND DESIGN PATTERN — EXERCISE 1
============================================================

SCENARIO:

You're building a simple smart-home system.

The system has a few devices:

    Light
    GarageDoor
    TV

You want a remote control that can execute commands without
knowing the details of how each device works.

For example:

    RemoteControl remote = new RemoteControl();

    remote.setCommand(new TurnLightOnCommand(light));
    remote.pressButton();

The remote should NOT contain logic like:

    if (command == "LIGHT_ON") ...
    if (command == "GARAGE_OPEN") ...


YOUR TASK:

Implement the Command design pattern from scratch.

Create:

    1. Command interface

       It should contain a method that represents executing
       the command.

    2. Light class

       Give it methods such as:

           turnOn()
           turnOff()

    3. GarageDoor class

       Give it methods such as:

           open()
           close()

    4. Concrete command classes

           TurnLightOnCommand
           TurnLightOffCommand

           OpenGarageDoorCommand
           CloseGarageDoorCommand

    5. RemoteControl class

       The remote should store a Command and have methods
       similar to:

           setCommand(...)
           pressButton()


EXPECTED USAGE:

    Light light = new Light();
    GarageDoor garageDoor = new GarageDoor();

    RemoteControl remote = new RemoteControl();

    remote.setCommand(new TurnLightOnCommand(light));
    remote.pressButton();

    remote.setCommand(new OpenGarageDoorCommand(garageDoor));
    remote.pressButton();


IMPORTANT:

The RemoteControl should NOT know about:

    Light
    GarageDoor
    TV

It should only know about:

    Command


Think about the responsibilities:

    RemoteControl
        |
        v
      Command
        |
        v
    Light / GarageDoor


QUESTIONS TO THINK ABOUT WHILE IMPLEMENTING:

1. Why do we need the Command interface?

2. What is the "command" object actually storing?

3. Which class is the Receiver?

4. Which class is the Invoker?

5. Which classes are Concrete Commands?

6. Does the RemoteControl need to know how a light turns on?

7. What happens if you add a new device?

8. What happens if you add a new operation to an existing device?

9. Why might it be useful to represent an action as an object?


============================================================
FOLLOW-UP EXERCISE 2 — UNDO
============================================================

Now extend your remote control to support UNDO.

The remote should remember the last command that was executed.

Add something like:

    remote.pressUndo();


For example:

    remote.setCommand(new TurnLightOnCommand(light));
    remote.pressButton();

    // Light is ON

    remote.pressUndo();

    // Light is OFF


Another example:

    remote.setCommand(new OpenGarageDoorCommand(garageDoor));
    remote.pressButton();

    // Garage door is OPEN

    remote.pressUndo();

    // Garage door is CLOSED


YOUR TASK:

Modify your Command abstraction so that commands can be
undone.

Each command should now know how to:

    execute()

and:

    undo()


The RemoteControl should be responsible for remembering
the previously executed command.


CONSTRAINTS:

1. Do NOT put device-specific logic inside RemoteControl.

2. RemoteControl should not contain:

       if light...
       if garage...
       if TV...

3. Each Concrete Command should know how to undo itself.

4. The Receiver classes (Light, GarageDoor, etc.) should
   remain responsible for their own device operations.

5. The RemoteControl should work with Command references,
   not concrete command types.


BONUS:

What happens if you press:

    remote.pressUndo();

before executing any command?

Handle that case cleanly.


EXTRA BONUS:

Instead of remembering only ONE command, make the remote
support multiple levels of undo.

Example:

    command 1 -> execute
    command 2 -> execute
    command 3 -> execute

Then:

    undo -> undoes command 3
    undo -> undoes command 2
    undo -> undoes command 1


Think about what data structure would naturally help you
implement this.


============================================================
FINAL REFLECTION
============================================================

After finishing both exercises, answer these in your own words:

1. What problem does the Command pattern solve?

2. Why is a command represented as an object?

3. What is the difference between:

       Command
       Concrete Command
       Receiver
       Invoker
       Client

4. Why doesn't RemoteControl directly call:

       light.turnOn()

5. What does Command give you that a normal method call
   doesn't?

6. Why does adding undo work particularly well with the
   Command pattern?

7. Where would you expect to see this pattern in real
   software?

   Think about:

       GUI buttons
       menus
       keyboard shortcuts
       transactions
       job queues
       undo/redo
       task scheduling


============================================================
*/
public class main {
}
