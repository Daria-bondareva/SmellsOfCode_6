package CodeSmells_lab_6.Part_3.IntroduceNullObject;

public class NullAddress implements Address {
    @Override
    public String getStreet() {
        return "Unknown";
    }

    @Override
    public String getCity() {
        return "Unknown";
    }
}

