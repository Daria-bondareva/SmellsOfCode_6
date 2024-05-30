package CodeSmells_lab_6.Part_3.ReplaceNestedConditionalGuard;

public class Order {
    public void processOrder(int quantity, double price) {
        if (quantity <= 0) {
            System.out.println("Invalid quantity");
            return;
        }

        if (price <= 0) {
            System.out.println("Invalid price");
            return;
        }

        System.out.println("Order processed successfully");
    }
}
