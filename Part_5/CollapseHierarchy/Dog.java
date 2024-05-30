package CodeSmells_lab_6.Part_5.CollapseHierarchy;

public class Dog {
    private String species;

    public Dog(String species) {
        this.species = species;
    }
    public void eat() {
        System.out.println("The dog is eating.");
    }

    public void sleep() {
        System.out.println("The dog is sleeping.");
    }

    public void bark() {
        System.out.println("The dog is barking.");
    }
}
