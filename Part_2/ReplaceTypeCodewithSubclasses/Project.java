package CodeSmells_lab_6.Part_2.ReplaceTypeCodewithSubclasses;

public class Project {
    public static void main(String[] args) {
        Product product1 = new Product1("Product A");
        Product product2 = new Product2("Product B");

        product1.process();
        product2.process();
    }
}
