package CodeSmells_lab_6.Part_5.PullUpConstructorBody;

class Dog extends Animal {
    String breed;
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
}

