package Inheritance_Abstraction_Polymorphism;

public class Abstraction{
    public static void main(String[] args){
        Circle circle = new Circle(4);
        System.out.println("Area is" + " " + circle.getArea());
        System.out.println("Perimeter is" +" "+ circle.getPerimeter());

    }

}

class Circle implements Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
