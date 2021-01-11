package com.kodilla.good.patterns.challenges.food2door;

public class HealthySupplier implements SupplierInterface {
    @Override
    public void process(Order order) {
    }

    public void deliver() {
        System.out.println("kurier");
    }
}
