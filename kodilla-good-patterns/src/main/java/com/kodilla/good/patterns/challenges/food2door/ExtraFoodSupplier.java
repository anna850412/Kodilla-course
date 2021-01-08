package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodSupplier implements SupplierI {
    @Override
    public void process(Order order) {

    }

    @Override
    public void deliver() {
        System.out.println("własny transport");
    }
}
