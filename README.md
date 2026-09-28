# WORK IN PROGRESS !!!

# Design Patterns in Java

Instead of just reading about each pattern, I wanted to actually sit down and implement all of them in Java. The goal was to get a 
better feel for how each pattern works, what problem it's trying to solve, and what the implementation actually looks like in practice.

Each pattern has its own implementation using standard Java classes and interfaces, with no additional frameworks or libraries.

## Patterns Covered

The repository includes implementations of all 23 classic GoF patterns across three categories:

- Creational Patterns — 5 patterns

- Structural Patterns — 7 patterns

- Behavioral Patterns — 11 patterns

This repository is primarily a learning exercise and a reference for revisiting design patterns through working code.

# UML Diagrams

I've also put together UML diagrams for each pattern implementation.

The idea here is to have both the code and the conceptual view of each implementation readily available. 
The Java code shows the actual implementation, while the UML diagrams make it easier to see how the pieces fit together and how the pattern is structured.

## Creational Patterns
Abstract Factory
<!-- Add Abstract Factory UML diagram here -->
Builder
<!-- Add Builder UML diagram here -->
Factory Method
<!-- Add Factory Method UML diagram here -->
Prototype
<!-- Add Prototype UML diagram here -->
Singleton
<!-- Add Singleton UML diagram here -->
## Structural Patterns
Adapter
<!-- Add Adapter UML diagram here -->
Bridge
<!-- Add Bridge UML diagram here -->
Composite
<!-- Add Composite UML diagram here -->
Decorator
<!-- Add Decorator UML diagram here -->
Facade
<!-- Add Facade UML diagram here -->
Flyweight
<!-- Add Flyweight UML diagram here -->
Proxy
<!-- Add Proxy UML diagram here -->
## Behavioral Patterns
Chain of Responsibility
<!-- Add Chain of Responsibility UML diagram here -->
Command
<!-- Add Command UML diagram here -->
Interpreter
<!-- Add Interpreter UML diagram here -->
Iterator
<!-- Add Iterator UML diagram here -->
Mediator
<!-- Add Mediator UML diagram here -->
Memento
<!-- Add Memento UML diagram here -->
Observer
<!-- Add Observer UML diagram here -->
State
<!-- Add State UML diagram here -->
Strategy
<!-- Add Strategy UML diagram here -->
Template Method
<!-- Add Template Method UML diagram here -->
Visitor
<!-- Add Visitor UML diagram here -->

# What I Learned
Implementing these patterns helped me understand a lot more about why architecture and planning matter when building software.

One of the biggest things I took away from this project was becoming much more comfortable with interfaces and with understanding 
code that someone else has written. Before starting this project, I remember coming across the Builder pattern in a library I use 
in one of my main projects, Clarity API, and being utterly confused about why I had to instantiate an object through a series of 
method calls instead of just using a constructor. After learning and implementing the pattern myself, that same kind of code makes a 
lot more sense.

Working through all 23 patterns has also broadened the way I think about programming. I have a better understanding now of how patterns 
can provide a kind of blueprint for structuring code, and how that structure can make software more flexible, scalable, and maintainable.

Something else I didn't really appreciate before this project was how much design patterns can improve the development experience. 
When you come across code that follows a pattern you recognize, you don't have to spend as much time figuring out the overall structure 
before you can start understanding the actual logic.

Overall, this project gave me a better appreciation for programming as more than just writing code that works. There's also a lot of 
thought that goes into how that code is organized, how easy it is for someone else to understand, and how well it can adapt as a project grows.
