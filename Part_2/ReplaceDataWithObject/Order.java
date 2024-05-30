package CodeSmells_lab_6.Part_2.ReplaceDataWithObject;

public class Order {
    private Customer customer;
    private double amount;
    // Конструктор та інші методи класу...


    public Order(Customer customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
// Інші методи класу...
}