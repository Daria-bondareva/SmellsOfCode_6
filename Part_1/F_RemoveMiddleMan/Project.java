package CodeSmells_lab_6.Part_1.F_RemoveMiddleMan;

public class Project {
    public static void main(String[] args) {
        Employee manager = new Employee("Alice", null);
        Department department = new Department("IT", manager); // Alice стає менеджером відділу IT
        Employee employee = new Employee("Bob", department); // Bob стає працівником відділу IT

        String managerName = employee.getDepartment().getManagerName();

        System.out.println("Manager's Name: " + managerName); // Виведе Manager's Name: Alice
    }
}

