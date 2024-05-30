package CodeSmells_lab_6.Part_1.D_InlineClass;

public class Person {
    private String name;
    private String street;
    private String city;
    private String country;
    // Конструктор, геттери та сеттери...

    public Person(String name, String street, String city, String country) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void printAddress() {
        System.out.println("Address: " + street + ", " + city + ", " + country);
    }
}
