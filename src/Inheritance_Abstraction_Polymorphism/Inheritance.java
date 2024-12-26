package Inheritance_Abstraction_Polymorphism;

public class Inheritance {
    public static void main(String[] args){
        Dog dog = new Dog("Afnaan");
        dog.eat();
        dog.bark();
    }
}

class Animals{
    String name;
    public Animals(String name){
        this.name = name;
    }
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animals { // Subclass inheriting from Animal
    public Dog(String name) {
        super(name); // Calling superclass constructor
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
}

