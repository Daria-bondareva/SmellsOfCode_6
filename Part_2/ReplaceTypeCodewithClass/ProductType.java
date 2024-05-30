package CodeSmells_lab_6.Part_2.ReplaceTypeCodewithClass;

public enum ProductType {
    TYPE_A(1, "Type A"),
    TYPE_B(2, "Type B"),
    TYPE_C(3, "Type C");

    private final int code;
    private final String name;

    ProductType(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
