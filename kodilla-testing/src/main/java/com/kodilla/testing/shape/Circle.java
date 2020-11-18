package com.kodilla.testing.shape;

public class Circle implements Shape {
    private double r;

    public Circle(int r) {
        this.r = r;
    }


    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }

    @Override
    public double getField() {
        return Math.PI * r * r;
    }
}
