package CodeSmells_lab_6.Part_2.ReplaceSubclasswithFields;

public class Shape {
    private double radius;
    private double width;
    private double height;
    private String type;

    // Конструктор для кола
    public Shape(double radius) {
        this.radius = radius;
        this.type = "circle";
    }

    // Конструктор для прямокутника
    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
        this.type = "rectangle";
    }
    //гетери...
    public String getType() {
        return type;
    }
}

