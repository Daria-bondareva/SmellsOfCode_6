package CodeSmells_lab_6.Part_1.A_MoveMethod;

import java.util.ArrayList;
import java.util.List;

public class Project {
    public static void main(String[] args) {
        Account maria = new Account(2500, 2);
        Account petro = new Account(1200, 5);
        List<Account> accounts = new ArrayList<>();

        accounts.add(maria);
        accounts.add(petro);

        Bank bank = new Bank(accounts);
        bank.processAccounts();
    }
}
