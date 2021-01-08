package com.kodilla.good.patterns.challenges.order;

public class ProductOrderService implements OrderService {
    public boolean order (final User user, final Product product) {
        System.out.println("User: " + "" + user.getUserName() + " " + "ordered product: " + " " + product.getProductName()
                + " " +"order date: " + product.getProductOrderedDate());
        return true;
    }
}
