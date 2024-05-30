package CodeSmells_lab_6.Part_2.ReplaceTypeCodewithSubclasses;

public abstract class Product {
    protected String name;

    public Product(String name) {
        this.name = name;
    }
    public abstract void process();
}

