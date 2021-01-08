package com.kodilla.good.patterns.challenges.food2door;

public class HealthySupplier implements SupplierI{
    @Override
    public void process(Order order) {
        Product product = new Product("patato", 'V',2,1);
//        HealthyShop healthyShop = new HealthyShop("HealthyShop",List<Product> productList,List<Supplier> supplierList);
    }

    @Override
    public void deliver() {
        System.out.println("kurier");
    }
}
