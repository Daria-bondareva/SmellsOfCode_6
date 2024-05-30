package CodeSmells_lab_6.Part_2.DuplicateObservedData;

public class OrderManager {
    private Order currentOrder;

    public OrderManager(Customer customer, Product product, int quantity) {
        this.currentOrder = new Order(customer, product, quantity);
    }

    public Customer getCustomer() {
        return currentOrder.getCustomer();
    }

    public void setCustomer(Customer customer) {
        currentOrder.setCustomer(customer);
    }

    public Product getProduct() {
        return currentOrder.getProduct();
    }

    public void setProduct(Product product) {
        currentOrder.setProduct(product);
    }

    public int getQuantity() {
        return currentOrder.getQuantity();
    }

    public void setQuantity(int quantity) {
        currentOrder.setQuantity(quantity);
    }

}