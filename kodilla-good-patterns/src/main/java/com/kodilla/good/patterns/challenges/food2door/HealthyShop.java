package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class HealthyShop extends Shop{
    public HealthyShop(String shopName, List<Product> productList, List<Supplier> supplierList) {
        super(shopName, productList, supplierList);
    }

    @Override
    public List<Product> getProductList() {
        return super.getProductList();
    }

    @Override
    public void setProductList(List<Product> productList) {
        super.setProductList((List<Product>) new Product("onion",'V', 2));
        super.setProductList((List<Product>) new Product("apple",'F', 10));
    }
}
