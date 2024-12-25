
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Red", "Ferrari");
        car1.accelerate();
        car1.accelerate();
        System.out.println("The current car speed is :" + car1.get_speed());
        System.out.println("The current car model is :" + car1.get_model());
        System.out.println("The current car color is :" + car1.get_color());

        }
    }