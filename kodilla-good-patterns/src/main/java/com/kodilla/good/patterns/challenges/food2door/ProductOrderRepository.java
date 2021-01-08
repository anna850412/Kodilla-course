package com.kodilla.good.patterns.challenges.food2door;

public class ProductOrderRepository implements OrderRepository{
    @Override
    public void createOrder(User user, Product product) {
        System.out.println("Order has been created");
    }
}
