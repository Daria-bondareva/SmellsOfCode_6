package CodeSmells_lab_6.Part_1.F_RemoveMiddleMan;

public class Department {
    private String name;
    private Employee manager;
    // Конструктор та інші методи класу...

    public Department(String name, Employee manager) {
        this.name = name;
        this.manager = manager;
    }

    public String getManagerName() {
        return manager.getName();
    }
}

