package CodeSmells_lab_6.Part_3.IntroduceNullObject;

public class Customer {
    private Address address;
    public Customer(Address address) {
        this.address = address;
    }
    public Address getAddress() {
        return address;
    }
}
