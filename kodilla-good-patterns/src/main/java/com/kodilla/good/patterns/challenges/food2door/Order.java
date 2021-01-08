package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public class Order {
    private Shop shop;
    private Supplier supplier;
    private Product product;
    private LocalDateTime orderDate;

    public Order(Shop shop, Supplier supplier, Product product, LocalDateTime orderDate) {
        this.shop = shop;
        this.supplier = supplier;
        this.product = product;
        this.orderDate = orderDate;
    }

    public Shop getShop() {
        return shop;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "shop=" + shop +
                ", supplier=" + supplier +
                ", product=" + product +
                ", orderDate=" + orderDate +
                '}';
    }


}
