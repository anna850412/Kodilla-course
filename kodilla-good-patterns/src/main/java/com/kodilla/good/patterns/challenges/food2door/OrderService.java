package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public interface OrderService {
    public boolean order(User user, List<Product> productList);
}
