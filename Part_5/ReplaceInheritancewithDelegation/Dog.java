package CodeSmells_lab_6.Part_5.ReplaceInheritancewithDelegation;

public class Dog {
    private final Animal animal;

    public Dog(Animal animal) {
        this.animal = animal;
    }

    void bark() {
        System.out.println("Dog is barking");
    }

    void interactWithAnimal() {
        animal.eat();
        animal.sleep();
    }
}
