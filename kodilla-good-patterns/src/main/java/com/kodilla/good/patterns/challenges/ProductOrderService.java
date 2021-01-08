package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    public boolean order (final User user, final Product product) {
        System.out.println("User: " + user.getUserName() + "ordered product: " + product.getProductName()
                + "order date: " + product.getProductOrderedDate());
        return true;
    }
}
