package Car;

public class Car {
    // 3 Attributes
    String make;
    String model;
    int speed;

    // Constructor
    public Car(String make, String model, int speed) {
        this.make = make;
        this.model = model;
        this.speed = speed;
    }

    // Behavior that changes an attribute
    public void speedUp(int increment) {
        this.speed += increment;
    }
}
