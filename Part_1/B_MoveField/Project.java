package CodeSmells_lab_6.Part_1.B_MoveField;

import java.util.ArrayList;
import java.util.List;

public class Project {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice");
        Employee emp2 = new Employee("Bob");

        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);

        List<Salary> salaries = new ArrayList<>();
        Company company = new Company(employees, salaries);

        company.setSalary(emp1, 50000);
        company.setSalary(emp2, 60000);

        company.printEmployeeSalaries();
    }
}
