package CodeSmells_lab_6.Part_3.ConsolidateDuplicateConditionalFragments;

public class Order {
    public void processOrder(int quantity, double price) {
        boolean discountApplied = false;
        if (quantity > 10) {
            // Дубльований фрагмент
            discountApplied = true;
            // Операція 1
        } else {
            // Операція 1
        }
        if (price > 100) {
            // Дубльований фрагмент
            discountApplied = true;
            // Операція 2
        } else {
            // Операція 2
        }
        if (discountApplied) {
            applyDiscount();
        }
    }

    private void applyDiscount() {
    }
}
