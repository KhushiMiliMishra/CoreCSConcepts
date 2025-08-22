# OOP

## What is OOP?
- It is a programming paradigm (a method to solve a problem or accomplish a task).
- It is based on objects (real world entities) which contain data and methods.


## Why OOP?
- Makes code easier to maintain, reusable and readable.
- Generic code so we dont have to write the basic stuff repeatedly.
- Development and maintenance of projects becomes simpler.

## Concepts in OOP
- Classes and Objects
- Abstraction
- Encapsulation
- Inheritance
- Polymorphism
- Dynamic Binding
- Message Passing

## Classes and Objects
- A class is a blueprint for creating objects (like a template).
- An object is an instance of a class with actual values (real-world entity).
- Example: 
### A class is like a blueprint of a house.
### An object is the actual house that is built from the bluprint.

## Abstraction
- Showing only the essential details and hiding the internal implementation.
- Example: You use car.start() without knowing how the engine works.

When you create an abstract class, you have to use the keyword "abstract".
It is usually used:
- to say a class is incomplete - meaning it is there, but we cant create objects from it because it does not have all the details in it
- to force child classes to implement its methods. So for example, 
`abstract void makeSound();` is like saying, every animal must have its own sound but i dont know it yet, so you(child class) figure it out.



## Encapsulation
- Wrapping data (variables) and methods (functions) into a single unit (class).
- Protects data using access modifiers (private, public, protected).
- Basically, hiding the internal details/data of a class and controlling the access through methods.

## Inheritance
- One class can acquire properties and behaviors of another class.
- Promotes reusability (e.g., Dog inherits from Animal).
### Types of inheritance:
- Single 
- Multiple
- Multilevel
- Hierarchical
- Hybrid

## Polymorphism
- The ability of one function, method, or operator to behave differently based on context.
- Example: draw() method works differently for Circle and Square.

## Dynamic Binding
- The method to be executed is decided at runtime, not compile time.
- Key for runtime polymorphism.
- Basically, the action is decided only when we know what object is being controlled.

## Message Passing
- Objects communicate by sending and receiving messages (method calls).
- Example: object.sendMessage("Hello", object2).