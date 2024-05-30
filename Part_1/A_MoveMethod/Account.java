package CodeSmells_lab_6.Part_1.A_MoveMethod;


public class Account {
    private double balance;
    private double interestRate;
    // Конструктор та інші методи класу...

    public Account(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }
}

