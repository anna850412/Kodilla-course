package com.kodilla.good.patterns.challenges.food2door;

public class Supplier {
    private String supplierName;
    private Product product;

    public Supplier(String supplierName, Product product) {
        this.supplierName = supplierName;
        this.product = product;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public Product getProduct() {
        return product;
    }


    public void process(Product product) {
        System.out.println("zamowienie zostało złożone");
    }
}
