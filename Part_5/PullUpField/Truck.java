package CodeSmells_lab_6.Part_5.PullUpField;

class Truck extends Vehicle {
    // Додаткові поля для підкласу Truck
    private int loadCapacity;
    public Truck(String color, int loadCapacity) {
        super(color);
        this.loadCapacity = loadCapacity;
    }
}
