
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Red", "Ferrai");
        car1.accelerate();
        car1.accelerate();
        System.out.println("The current car speed is :" + car1.get_speed());

        }
    }