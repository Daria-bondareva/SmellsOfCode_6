package CodeSmells_lab_6.Part_3.IntroduceNullObject;

public class RealAddress implements Address {
    private String street;
    private String city;

    public RealAddress(String street, String city) {
        this.street = street;
        this.city = city;
    }

    @Override
    public String getStreet() {
        return street;
    }

    @Override
    public String getCity() {
        return city;
    }
}

