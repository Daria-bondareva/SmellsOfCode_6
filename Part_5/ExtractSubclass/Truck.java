package CodeSmells_lab_6.Part_5.ExtractSubclass;

public class Truck extends Vehicle{
    public void start() {
        System.out.println("Truck starting...");
    }

    public void stop() {
        System.out.println("Truck stopping...");
    }
}
