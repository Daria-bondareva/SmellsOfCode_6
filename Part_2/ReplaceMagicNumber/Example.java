package CodeSmells_lab_6.Part_2.ReplaceMagicNumber;

import java.util.ArrayList;
import java.util.List;

public class Example {
    private static final int MAX_COUNT = 100;
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        // Додавання елементів у список
        for (int i = 0; i < MAX_COUNT; i++) {
            items.add("Item " + i);
        }
    }
}
