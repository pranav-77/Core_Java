package com.pranav.mockito;

import java.util.HashMap;
import java.util.Map;

class Product {
    private String id;
    private String name;
    private double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// Class for managing Cart items
class Cart {
    private Map<Product, Integer> items;

    public Cart() {
        items = new HashMap<>();
    }

    public void addItem(Product product, int quantity) {
        items.put(product, items.getOrDefault(product, 0) + quantity);
    }

    public Map<Product, Integer> getItems() {
        return items;
    }
}

// Interface for PaymentService
interface PaymentService {
    boolean processPayment(String cardNumber, double amount);
}

// Class for OnlinePurchase
class OnlinePurchase {
    private Cart cart;
    private PaymentService paymentService;

    public OnlinePurchase(PaymentService paymentService) {
        this.cart = new Cart();
        this.paymentService = paymentService;
    }

    public void addItemToCart(Product product, int quantity) {
        cart.addItem(product, quantity);
    }

    public boolean checkout(String cardNumber) {
        double totalAmount = cart.getItems().entrySet().stream()
                .mapToDouble(e -> e.getKey().getPrice() * e.getValue())
                .sum();

        return paymentService.processPayment(cardNumber, totalAmount);
    }

}
