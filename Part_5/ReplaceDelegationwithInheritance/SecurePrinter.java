package CodeSmells_lab_6.Part_5.ReplaceDelegationwithInheritance;

public class SecurePrinter extends Printer {
    void printSecurely(String document) {
        System.out.println("Printing securely: " + document);
        super.print(document);
    }
}
