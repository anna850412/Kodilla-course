package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodSupplier implements SupplierInterface {

    @Override
    public void process(Order order) {

    }

    public void deliver() {
        System.out.println("własny transport");
    }
}
