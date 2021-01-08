package com.kodilla.good.patterns.challenges.food2door;

public class Shop {
    private String shopName;
    private Product product;
    private Supplier supplier;
    private Order order;

    public Shop(String shopName, Product product, Supplier supplier, Order order) {
        this.shopName = shopName;
        this.product = product;
        this.supplier = supplier;
        this.order = order;
    }

    public String getShopName() {
        return shopName;
    }

    public Product getProduct() {
        return product;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Order getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopName='" + shopName + '\'' +
                ", product=" + product +
                ", supplier=" + supplier +
                ", order=" + order +
                '}';
    }
}
