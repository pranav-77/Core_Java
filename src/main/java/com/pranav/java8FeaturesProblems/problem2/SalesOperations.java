package com.pranav.java8FeaturesProblems.problem2;

import java.util.*;
import java.util.stream.Collectors;

public class SalesOperations {
    static List<Product> products = new ArrayList<>();
    static final int quantity = 50;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        products = Arrays.asList(
                new Product(1, 45, 100),
                new Product(2, 50, 50),
                new Product(3, 8, 10),
                new Product(4, 2, 150),
                new Product(5, 23, 25),
                new Product(6, 31, 80)
        );
        while (true) {
            System.out.println("1. Display the product details");
            System.out.println("2. Filter Sales where quantity sold more than 10");
            System.out.println("3. Calculate total revenue for each product");
            System.out.println("4. Sort the product by revenue");
            System.out.println("5. Retrieve top products");
            System.out.println("6. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    displayProducts(products);
                    break;
                }
                case 2: {
                    filterSales(products);
                    break;
                }
                case 3: {
                    List<Product> revenueList = calculateRevenue(products);
                    for (Product p : revenueList) {
                        System.out.println("ProductId: " + p.getProductId() + ", Revenue: " + p.getPrice());
                    }
                    break;
                }
                case 4: {
                    sortByRevenue(calculateRevenue(products));
                    break;
                }
                case 5: {
                    topProducts(calculateRevenue(products));
                    break;
                }
                case 6: {
                    System.exit(0);
                }
                default: {
                    System.out.println("Invalid input");
                    break;
                }
            }
        }
    }

    private static void topProducts(List<Product> products) {
        List<Product> topProducts = products
                .stream()
                .sorted(Comparator.comparing(Product::getPrice).reversed())
                .limit(5)
                .collect(Collectors.toList());
        topProducts.forEach(product -> System.out.println("ProductId: " + product.getProductId() + ", Revenue: " + product.getPrice()));
    }

    private static void sortByRevenue(List<Product> products) {
        products
                .stream()
                .sorted(Comparator.comparing(Product::getPrice).reversed())
                .forEach(System.out::println);
    }

    private static List<Product> calculateRevenue(List<Product> products) {
        List<Product> revenueList = products
                .stream()
                .map(data -> {
                    double revenue = (quantity - data.getQuantity()) * data.getPrice();
                    return new Product(data.getProductId(), data.getQuantity(), revenue);
                })
                .collect(Collectors.toList());
        return revenueList;
    }

    private static void filterSales(List<Product> products) {
        List<Product> productList = products
                .stream()
                .filter(data -> data.getQuantity() <= quantity - 10)
                .collect(Collectors.toList());
        productList.forEach(System.out::println);
    }

    private static void displayProducts(List<Product> products) {
        if (products.isEmpty()) {
            System.out.println("No Products Available");
        } else {
            products.forEach(System.out::println);
        }
    }
}
