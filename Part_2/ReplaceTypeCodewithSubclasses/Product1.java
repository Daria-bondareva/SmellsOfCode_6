package CodeSmells_lab_6.Part_2.ReplaceTypeCodewithSubclasses;

public class Product1 extends Product {
    public Product1(String name) {
        super(name);
    }

    @Override
    public void process() {
        System.out.println("Processing Product 1: " + name);
    }
}
