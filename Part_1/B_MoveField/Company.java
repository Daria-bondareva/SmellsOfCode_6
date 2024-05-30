package CodeSmells_lab_6.Part_1.B_MoveField;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company {
    private List<Employee> employees;
    private List<Salary> salary;

    // Конструктор та інші методи класу...
    public Company(List<Employee> employees, List<Salary> salary) {
        this.employees = employees;
        this.salary = salary;
    }

    public void setSalary(Employee employee, double salaryEveryone) {
        for (Salary s : salary) {
            if (s.getEmployee().equals(employee)) {
                s.setSum(salaryEveryone);
                return;
            }
        }
        salary.add(new Salary(employee, salaryEveryone));
    }

    public double getSalary(Employee employee) {
        for (Salary s : salary) {
            if (s.getEmployee().equals(employee)) {
                return s.getSum();
            }
        }
        return 0.0; // Якщо зарплата не знайдена
    }

    public void printEmployeeSalaries() {
        for (Employee employee : employees) {
            System.out.println(employee.getName() + ": " + getSalary(employee));
        }
    }
}