package CodeSmells_lab_6.Part_4.AddParameter;

public class Calculator {
    public double calculateTotal(double price, int quantity, double tax) {
        return price * quantity * (1 + tax);
    }
}
