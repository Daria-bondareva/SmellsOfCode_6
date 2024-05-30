package CodeSmells_lab_6.Part_4.SeparateQueryfromModifier;

public class Account {
    private double balance;
    public void deductionCommission(){
        double commission = 0.05;
        balance -= balance * commission;
    }
    public double getBalance() {
        return balance;
    }
}

