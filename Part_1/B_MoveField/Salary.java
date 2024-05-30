package CodeSmells_lab_6.Part_1.B_MoveField;

public class Salary {
    private Employee employee;
    private double sum;

    public Salary(Employee employee, double sum) {
        this.employee = employee;
        this.sum = sum;
    }

    public Employee getEmployee() {
        return employee;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}
