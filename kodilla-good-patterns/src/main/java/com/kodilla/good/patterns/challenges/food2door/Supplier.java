package com.kodilla.good.patterns.challenges.food2door;

public class Supplier implements OrderRequest{
    private String supplierName;
    private Product product;
    private Shop shop;
    private Order oder;

    public Supplier(String supplierName, Product product, Shop shop, Order oder) {
        this.supplierName = supplierName;
        this.product = product;
        this.shop = shop;
        this.oder = oder;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public Product getProduct() {
        return product;
    }

    public Shop getShop() {
        return shop;
    }

    public Order getOder() {
        return oder;
    }

    @Override
    public void process() {
    shop.getOrder();
    }
}
