package CodeSmells_lab_6.Part_5.PullUpConstructorBody;

class Cat extends Animal {
    String color;
    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }
}
