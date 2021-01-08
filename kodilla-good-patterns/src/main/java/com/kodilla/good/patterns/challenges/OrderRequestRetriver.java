package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriver {
    public OrderRequest retrive() {
        User user = new User("Kowalski", "JanK123");
        Product product = new Product("TV", 2000, LocalDateTime.of(2021, 1, 6, 12, 00));
    return new OrderRequest(user, product);
    }
}
