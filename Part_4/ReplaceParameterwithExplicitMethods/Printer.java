package CodeSmells_lab_6.Part_4.ReplaceParameterwithExplicitMethods;

public class Printer {
    public void printText(String content) {
        System.out.println("Printing text document: " + content);
    }
    public void printImage(String content) {
        System.out.println("Printing image document: " + content);

    }
}
