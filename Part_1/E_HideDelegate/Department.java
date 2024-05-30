package CodeSmells_lab_6.Part_1.E_HideDelegate;

public class Department {
    private String name;
    private Employee manager;
    // Конструктор та інші методи класу...

    public Department(String name, Employee manager) {
        this.name = name;
        this.manager = manager;
    }

    public Employee getManager() {
        return manager;
    }

    public String getName() {
        return name;
    }
}

