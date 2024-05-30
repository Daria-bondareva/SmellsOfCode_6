package CodeSmells_lab_6.Part_5.ReplaceInheritancewithDelegation;

public class Person {
    private final Animal animal;

    public Person(Animal animal) {
        this.animal = animal;
    }

    void interactWithAnimal() {
        animal.eat();
        animal.sleep();
    }
}
