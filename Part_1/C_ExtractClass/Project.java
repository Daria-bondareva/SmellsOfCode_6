package CodeSmells_lab_6.Part_1.C_ExtractClass;

public class Project {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", "Engineering");
        Salary salary = new Salary(employee, 50000);

        employee.printEmployeeDetails(salary);
    }
}
