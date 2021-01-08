package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public class Order {
    private Shop shop;
    private Product product;
    private LocalDateTime orderDate;

    public Order(Shop shop, Product product, LocalDateTime orderDate) {
        this.shop = shop;
        this.product = product;
        this.orderDate = orderDate;
    }

    public Shop getShop() {
        return shop;
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
                ", product=" + product +
                ", orderDate=" + orderDate +
                '}';
    }


}
