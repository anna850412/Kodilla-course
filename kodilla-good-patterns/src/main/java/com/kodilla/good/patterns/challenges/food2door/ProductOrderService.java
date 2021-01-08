package com.kodilla.good.patterns.challenges.food2door;

public class ProductOrderService implements OrderService{
    @Override
    public boolean order(User user, Product product) {
        System.out.println("User: " + " " + user.getUserName() + " " +
                "ordered product: " + " " + product.getProductName() );
        return true;
    }
}
