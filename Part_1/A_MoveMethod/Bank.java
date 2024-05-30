package CodeSmells_lab_6.Part_1.A_MoveMethod;

import java.util.List;

public class Bank {

    private List<Account> accounts;
    // Конструктор та інші методи класу...

    public Bank(List<Account> accounts) {
        this.accounts = accounts;
    }
    public void calculateInterest(Account account){
        double interest = account.getInterestRate() * account.getBalance() / 100;
        System.out.println("Interest calculated: " + interest);
        // Логіка для обчислення відсотків...
    }
    public void processAccounts() {
        for (Account account : accounts) {
            calculateInterest(account);
        }
    }
}