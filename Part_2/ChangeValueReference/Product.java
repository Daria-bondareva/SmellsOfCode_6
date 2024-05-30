package CodeSmells_lab_6.Part_2.ChangeValueReference;

import java.util.HashMap;
import java.util.Map;

public class Product {
    private static final Map<String, Product> productCache = new HashMap<>();

    private String name;
    private double price;
    private String currencyCode;

    private Product(String name, double price, String currencyCode) {
        this.name = name;
        this.price = price;
        this.currencyCode = currencyCode;
    }

    public static Product getProduct(String name, double price, String currencyCode) {
        return productCache.computeIfAbsent(currencyCode, key -> new Product(name, price, key));
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    // Інші методи класу, якщо потрібно
}
