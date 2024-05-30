package CodeSmells_lab_6.Part_2.ReplaceTypeCodewithSubclasses;

public class Product2 extends Product {
    public Product2(String name) {
        super(name);
    }

    @Override
    public void process() {
        // Логіка для продукту типу 2
        System.out.println("Processing ProductType2: " + name);
    }
}
