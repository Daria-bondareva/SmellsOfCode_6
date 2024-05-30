package CodeSmells_lab_6.Part_4.HideMethod;

public class Calculator {
    private double calculateTotal(double price, int quantity, double tax) {
        return price * quantity * (1 + tax);
    }
}