package CodeSmells_lab_6.Part_3.IntroduceAssertion;

import java.util.List;

public class Calculator {
    public double calculateAverage(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("Список чисел не може бути порожнім");
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.size();
    }
}
