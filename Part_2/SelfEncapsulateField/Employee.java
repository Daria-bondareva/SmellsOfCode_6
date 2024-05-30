package CodeSmells_lab_6.Part_2.SelfEncapsulateField;

public class Employee {
    private String name;
    private double salary;
    // Конструктор та інші методи класу...

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public void raiseSalary(double amount) {
        if (amount > 0) {
            setSalary(getSalary() + amount);
        }
    }

    // Інші методи класу...
}
