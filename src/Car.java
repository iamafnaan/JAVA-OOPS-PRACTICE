public class Car {
    private String color;
    private int speed;
    private String model;

    public Car(String color, String model){
        this.color = color;
        this.model = model;
        this.speed = 0;
    }

    public void accelerate(){
        speed+=10;
    }
    public void brakes(){
        if (speed > 5) {
            speed -= 5;
        }
    }

    public int get_speed(){
        return speed;
    }
    public String get_color(){
        return color;
    }
    public String get_model(){
        return model;
    }

}
