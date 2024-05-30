package CodeSmells_lab_6.Part_4.ReplaceErrorCodewithException;

public class Calculator {
    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Ділення на нуль неможливе");
        }
        return dividend / divisor;
    }
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Результат ділення: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}

