package CodeSmells_lab_6.Part_1.F_RemoveMiddleMan;

public class Employee {
    private String name;
    private Department department;
    // Конструктор та інші методи класу...

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }
}
