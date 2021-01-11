package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public abstract class Shop {
    private String shopName;
    private List<Product> productList;
    private List<Supplier> supplierList;

    public Shop(String shopName, List<Product> productList, List<Supplier> supplierList) {
        this.shopName = shopName;
        this.productList = productList;
        this.supplierList = supplierList;
    }

    public void setSupplierList(List<Supplier> supplierList) {
        this.supplierList = supplierList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public String getShopName() {
        return shopName;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public List<Supplier> getSupplierList() {
        return supplierList;
    }

    public void processOrder(Order order) {
        if (productList.contains(order.getProductList())) {
            System.out.println("przekazujemy zamowienie + " + "" + order + "z datą" + "" + order.getOrderDate());
//            supplier.process(order.getProduct());
        } else {
            System.out.println("nie można złożyć zamówienia w tym sklepie");
        }
    }
}