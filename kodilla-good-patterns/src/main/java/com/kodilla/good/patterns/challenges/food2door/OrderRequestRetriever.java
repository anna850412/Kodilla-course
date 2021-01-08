package com.kodilla.good.patterns.challenges.food2door;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Kowalski");
        Product product = new Product("Onion", 'V',2, 10);
        return new OrderRequest(user, product);
    }

}
