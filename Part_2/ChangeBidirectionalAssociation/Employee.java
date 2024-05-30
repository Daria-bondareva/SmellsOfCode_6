package CodeSmells_lab_6.Part_2.ChangeBidirectionalAssociation;

public class Employee {
    private String name;
    private Department department;

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }
    // Додаткові методи...
}

