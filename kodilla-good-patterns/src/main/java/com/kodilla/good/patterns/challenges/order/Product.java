package com.kodilla.good.patterns.challenges.order;

import java.time.LocalDateTime;

public class Product {
    private String productName;
    private double price;
    private LocalDateTime productOrderedDate;

    public Product(String productName, double price, LocalDateTime productOrderedDate) {
        this.productName = productName;
        this.price = price;
        this.productOrderedDate = productOrderedDate;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public LocalDateTime getProductOrderedDate() {
        return productOrderedDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", productOrderedDate=" + productOrderedDate +
                '}';
    }
}
