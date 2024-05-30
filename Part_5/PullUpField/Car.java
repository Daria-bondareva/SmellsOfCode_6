package CodeSmells_lab_6.Part_5.PullUpField;

class Car extends Vehicle {
    // Додаткові поля для підкласу Car
    private String model;
    public Car(String color, String model) {
        super(color);
        this.model = model;
    }
}
