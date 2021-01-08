package com.kodilla.good.patterns.challenges.food2door;

public class Product {
    private String productName;
    private char productKind;
    private double productPrice;
    private double productQuantity;

    public Product(String productName, char productKind, double productPrice, double productQuantity) {
        this.productName = productName;
        this.productKind = productKind;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public char getProductKind() {
        return productKind;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public double getProductQuantity() {
        return productQuantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productKind=" + productKind +
                ", productPrice=" + productPrice +
                ", productQuantity=" + productQuantity +
                '}';
    }
}
