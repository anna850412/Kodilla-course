package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public abstract class Shop {
    private String shopName;
    private List<Product> productList;
    private List<Supplier> supplierList;

    public void setSupplierList(List<Supplier> supplierList) {
        this.supplierList = supplierList;
    }

    public Shop(String shopName, List<Product> productList, List<Supplier> supplierList) {
        this.shopName = shopName;
        this.productList = productList;
        this.supplierList = supplierList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
//    productList.add();
//    supplierList.add("HealthyShop");
    Supplier supplier = new Supplier("ABC", new Product("RTV",'E', 20000, 1));
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
        if (productList.contains(order.getProduct())) {
            System.out.println("przekazujemy zamowienie + " + "" + order + "z datą" + "" + order.getOrderDate());
            supplier.process(order.getProduct());
        } else {
            System.out.println("nie można złożyć zamówienia w tym sklepie");
        }
    }
}
