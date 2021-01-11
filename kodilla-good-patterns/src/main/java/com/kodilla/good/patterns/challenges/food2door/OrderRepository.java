package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public interface OrderRepository {
    public void createOrder(User user, List<Product> productList);
}
