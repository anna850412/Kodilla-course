package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeSupplier implements SupplierI{
    @Override
    public void process(Order order) {

    }

    @Override
    public void deliver() {
        System.out.println("poczta polska");
    }
}
