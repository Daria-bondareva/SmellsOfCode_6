package CodeSmells_lab_6.Part_5.ExtractSubclass;

public class Car extends Vehicle{
    public void start() {
        System.out.println("Car starting...");
    }

    public void stop() {
        System.out.println("Car stopping...");
    }

    public void accelerate() {
        System.out.println("Car accelerating...");
    }
}
