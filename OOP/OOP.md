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
- We can hide the private data and give controlled access to pubic data.
- Basically, hiding the internal details/data of a class and controlling the access through methods.
- For example: you press a button in an ATM machine and it gives you cash. You dont see how the machine is doing it on the inside (especially coz it is private). This is encapsulation.
- Steps to follow if you dont know how to encapsulate:
    1. identify the sensitive data (that shouldnt be accessed by outsiders)
    2. make those variables private (like `balance` in `bankAccount` or `DOB` in `Person`)
    3. provide public methods to access/modify that data
        here, you have:
        - getters(returns value requested) 
        Example: `public double getBalance(){ return balance; }` 
        - setters(changes values with mentioned rules)
        Example: `public void setName(String name) {this.name=name;}`




## Inheritance
- One class can acquire properties and behaviors of another class.
- Promotes reusability (e.g., Dog inherits from Animal).
### Types of inheritance:
- Single 
- Multiple
- Multilevel
- Hierarchical
- Hybrid
-(Java doesnt support Multiple inheritance and it is instead done with the help of interfaces)

### Interfaces
- An Interface is defined as an abstract type used to specify the behaviour of a class. 
- It is a blueprint of a behaviour.
- It contains static constants and abstract methods.
- Best way to understand it is: in a superhero game, the superhero must be able to 
    - `fly()`
    - `savePeople()`
    - `fightVillain()`
    So here, these are interfaces. It doesnt explain how the superhero flies or how he saves people. It says this is what the superhero should be able to do.

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


## Constructors
- A constructor is a special method in a class that
    - runs automatically when we create a new object
    - is used to set up initial values for the object
- The name of the constructor should be the same as the class name
- There is no return type for constructors
- I have given an example of using constructors in the `Library.java` program!
