package Inheritance_Abstraction_Polymorphism;

public class Polymorphism {
    public int add(int a, int b) { // Method overloading
        return a + b;
    }

    public double add(double a, double b) { // Method overloading
        return a + b;
    }

}
class Animal {
    public void makeSound(){
        System.out.println("Generic animal sound.");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Meow.");
    }
}

class PolymorphismExample {
    public static void main(String[] args) {
        Polymorphism calc = new Polymorphism();
        System.out.println(calc.add(2, 3)); // Calls int add()
        System.out.println(calc.add(2.5, 3.5)); // Calls double add()

        Animal animal = new Animal();
        Animal cat = new Cat();
        animal.makeSound(); // Calls superclass method
        cat.makeSound(); // Calls overridden subclass method
    }
}
