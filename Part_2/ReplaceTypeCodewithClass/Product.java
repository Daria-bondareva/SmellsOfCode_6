package CodeSmells_lab_6.Part_2.ReplaceTypeCodewithClass;

public class Product {
    private ProductType typeCode;
    private String name;

    public Product(ProductType typeCode, String name) {
        this.typeCode = typeCode;
        this.name = name;
    }

    public ProductType getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(ProductType typeCode) {
        this.typeCode = typeCode;
    }
// Додаткові методи...
}
