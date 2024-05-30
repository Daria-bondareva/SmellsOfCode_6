package CodeSmells_lab_6.Part_2.EncapsulateField;

public class Person {
    private int age;
    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
