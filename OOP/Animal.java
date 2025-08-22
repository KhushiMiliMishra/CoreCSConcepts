package OOP;

public abstract class Animal {
    abstract void makeSound();

    public void Sleep()
    {
        System.out.println("ZZZ");

    }
}
class Dog extends Animal{
    void makeSound()
    {
        System.out.println("Woof woof!");
    }
}
class Cat extends Animal{
    void makeSound()
    {
        System.out.println("Meow!");
    }
}

class Main{
    public static void main(String[] args) {
        Cat c=new Cat();
        c.makeSound();
        c.Sleep();

        Dog d=new Dog();
        d.makeSound();

    }
}