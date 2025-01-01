package com.stream;
import java.util.*;
import java.util.stream.Collectors;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

public class LambdaExample {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 1200),
            new Product("Phone", 800),
            new Product("Tablet", 400)
        );

        // Sorting products by price using a lambda expression
        products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));

        // Printing sorted products
        products.forEach(product -> System.out.println(product.name + ": " + product.price));
    }
}
