package CodeSmells_lab_6.Part_2.ReplaceTypeCodewithState;

public class Order {
    private OrderStatus status;

    public Order() {
        this.status = OrderStatus.NEW;
    }
    // Інші методи класу...
}
